/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAluno;

/**
 *
 * @author rodri
 */
public class DaoALuno {
    ConexaoBD conex = new ConexaoBD();
    BeansAluno mod = new BeansAluno();
    
    public void Salvar (BeansAluno mod){
        conex.conexao();
        try { 
            PreparedStatement pst  = conex.con.prepareStatement("insert into alunos(nome_aluno,curso_aluno,matricula_aluno,endereco_aluno,cpf_aluno,numend_aluno,bairro_aluno) values(?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCurso());
            pst.setInt(3,mod.getMatricula());
            pst.setString(4,mod.getEnderecoAluno());
            pst.setString(5, mod.getCpfAluno());
            pst.setInt(6, mod.getNumEnderecoAluno());
            pst.setString(7, mod.getBairroAluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos corretos");
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoALuno.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados /n Erro:" +ex);
        }
        
        
        conex.desconecta();
    }
    
    public void Editar(BeansAluno mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update alunos set nome_aluno=?, curso_aluno=?, matricula_aluno=?,endereco_aluno=?, cpf_aluno=?, numend_aluno=?, bairro_aluno=?   where cod_aluno=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCurso());
            pst.setInt(3, mod.getMatricula()); 
            pst.setString(4,mod.getEnderecoAluno());
            pst.setString(5, mod.getCpfAluno());
            pst.setInt(6, mod.getNumEnderecoAluno());
            pst.setString(7, mod.getBairroAluno());
            pst.setInt(8, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "dados alterados com sucesso.");
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoALuno.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro na alteração /n Erro" +ex);
        }
        
        conex.desconecta();
        
    }
    
    public void Excluir (BeansAluno mod){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from alunos where cod_aluno=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso" );
            
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar/n Erro" +ex);
        }
    }
    public BeansAluno buscaAluno(BeansAluno mod){
        conex.conexao();
        conex.executaSql("select *from alunos where nome_aluno like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_aluno"));
            mod.setNome(conex.rs.getString("nome_aluno"));
            mod.setMatricula(conex.rs.getInt("matricula_aluno"));
            mod.setCurso(conex.rs.getString("curso_aluno"));
            mod.setEnderecoAluno(conex.rs.getString("endereco_aluno"));
            mod.setCpfAluno(conex.rs.getString("cpf_aluno"));
            mod.setNumEnderecoAluno(conex.rs.getInt("numend_aluno"));
            mod.setBairroAluno(conex.rs.getString("bairro_aluno"));
        } catch (SQLException ex) {
            Logger.getLogger(DaoALuno.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Aluno não cadastrado");
        }
        
        conex.desconecta();
        return mod;
    }
    
}
