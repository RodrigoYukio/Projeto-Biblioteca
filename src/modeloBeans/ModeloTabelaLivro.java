/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodri
 */
public class ModeloTabelaLivro extends AbstractTableModel{

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    
    public ModeloTabelaLivro(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }
   
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){
        Object [] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}
