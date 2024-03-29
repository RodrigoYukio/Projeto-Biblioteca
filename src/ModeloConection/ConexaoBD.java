/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author rodri
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/projetoEngenharia2";
    private String usuario = "postgres";
    private String senha = "123";
    public Connection con;
    
    public void conexao(){
        System.setProperty("jdbc.Drivers",driver);
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
           // JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(null,"Erro na conexão do BD:\n" +ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao executaSQL" +ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
           // JOptionPane.showMessageDialog(null, "BD desconectado com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar o BD \n." +ex.getMessage());
        }
    }
    
}
