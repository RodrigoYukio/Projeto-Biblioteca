/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloConection.ConexaoBD;

import modeloBeans.BeansLivro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class DaoLivro {
    ConexaoBD conex = new ConexaoBD();
    BeansLivro mod = new BeansLivro();
    
    public void Salvar (BeansLivro mod){
        conex.conexao();
        try { 
            PreparedStatement pst  = conex.con.prepareStatement("insert into livro(titulo_livro,isbn_livro,edicao_livro,ano_livro,area_livro,nome_livro,sobrenome_livro) values(?,?,?,?,?,?,?)");
            pst.setString(1,mod.getTitulo());
            pst.setString(2,mod.getISBN());
            pst.setString(3,mod.getEdicao());
            pst.setInt(4,mod.getAno());
            pst.setString(5, mod.getArea());
            pst.setString(6, mod.getNome());
            pst.setString(7, mod.getSobrenome());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos corretos");
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoALuno.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados /n Erro:" +ex);
        }
        
        
        conex.desconecta();
    }
      public void Editar(BeansLivro mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update livro set titulo_livro=?, isbn_livro=?, edicao_livro=?,ano_livro=?, area_livro=?,nome_livro=?, sobrenome_livro=?   where cod_livro=?");
            pst.setString(1, mod.getTitulo());
            pst.setString(2, mod.getISBN());
            pst.setString(3, mod.getEdicao()); 
            pst.setInt(4, mod.getAno());
            pst.setString(5,mod.getArea());
            pst.setString(6, mod.getNome());
            pst.setString(7, mod.getSobrenome());
            pst.setInt(8, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "dados alterados com sucesso.");
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoLivro.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro na alteração /n Erro" +ex);
        }
        
        conex.desconecta();
        
    }
       public BeansLivro buscaLivro(BeansLivro mod){
        conex.conexao();
        conex.executaSql("select *from livro where titulo_livro like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_livro"));
            mod.setTitulo(conex.rs.getString("titulo_livro"));
            mod.setISBN(conex.rs.getString("isbn_livro"));
            mod.setEdicao(conex.rs.getString("edicao_livro"));
            mod.setAno(conex.rs.getInt("ano_livro"));
            mod.setArea(conex.rs.getString("area_livro"));
            mod.setNome(conex.rs.getString("nome_livro"));
            mod.setSobrenome(conex.rs.getString("sobrenome_livro"));
        } catch (SQLException ex) {
            Logger.getLogger(DaoLivro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Livro não cadastrado");
        }
        
        conex.desconecta();
        return mod;
    }
       public void Excluir (BeansLivro mod){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from livro where cod_livro=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados /n Erro" +ex);
            
        }
         
          conex.desconecta();
    }
      
    
}
