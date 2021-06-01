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
import modeloBeans.BeansSituacao;

/**
 *
 * @author rodri
 */
public class DaoSituacao {
    
    BeansSituacao situacao = new BeansSituacao();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexAluno = new ConexaoBD();
    ConexaoBD conexLivro = new ConexaoBD();
    int codAluno;
    int codLivro;
    
    public void Salvar(BeansSituacao situacao){
        BuscaAluno(situacao.getNomeAluno());
        BuscaLivro(situacao.getNomeLivro());
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into emprestimo(emp_codaluno,emp_codlivro,emp_dataempres,emp_situacao)values(?,?,?,?)");
            pst.setInt(1, codAluno);
            pst.setInt(2, codLivro);
            pst.setString(6,situacao.getStatus());
            pst.setString(5, situacao.getStatus());
            pst.execute();
            JOptionPane.showConfirmDialog(null, "situacao salva");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "erro ao salvar situaacao" +ex);
            
        }
        conex.desconecta();
                
    }
    
    public void BuscaAluno(String nomeAluno){
        conexAluno.conexao();
        conexAluno.executaSql("select *from alunos where nome_aluno ='"+nomeAluno+"'");
        try {
            conexAluno.rs.first();
            codAluno = conexAluno.rs.getInt("cod_aluno");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"aluno nao encontrado");
        }
        
    }
    
    public void BuscaLivro(String nomeLivro){
        conexLivro.conexao();
        conexLivro.executaSql("select *from livro where titulo_livro ='"+nomeLivro+"'");
        try {
            conexLivro.rs.first();
            codLivro = conexLivro.rs.getInt("cod_livro");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"livro nao encontrado");
        }
    }
}
