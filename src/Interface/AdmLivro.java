/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import ModeloConection.ConexaoBD;
import ModeloDao.DaoLivro;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansLivro;
import modeloBeans.ModeloTabelaLivro;

/**
 *
 * @author rodri
 */
public class AdmLivro extends javax.swing.JFrame {
    
    BeansLivro mod = new BeansLivro();
    DaoLivro control = new DaoLivro();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public AdmLivro() {
        initComponents();
        preecherTabelaLivro("select *from livro order by cod_livro");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivro = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldTitulo = new javax.swing.JFormattedTextField();
        jFormattedTextFieldISBN = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEdicao = new javax.swing.JFormattedTextField();
        jFormattedTextFieldAno = new javax.swing.JFormattedTextField();
        jFormattedTextFieldArea = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNome = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSobrenome = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jtCOD = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Verificar Livro");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLivro);

        jLabel2.setText("Titulo:");

        jLabel3.setText("ISBN:");

        jLabel5.setText("Edição:");

        jLabel6.setText("Ano:");

        jLabel7.setText("Área:");

        jLabel8.setText("Autor:");

        jFormattedTextFieldTitulo.setEnabled(false);

        jFormattedTextFieldISBN.setEnabled(false);

        jFormattedTextFieldEdicao.setEnabled(false);

        jFormattedTextFieldAno.setEnabled(false);

        jFormattedTextFieldArea.setEnabled(false);

        jFormattedTextFieldNome.setEnabled(false);

        jFormattedTextFieldSobrenome.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ADM Livro");

        jtCOD.setEnabled(false);
        jtCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCODActionPerformed(evt);
            }
        });

        jLabelID.setText("ID");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(708, 708, 708)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextFieldEdicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelID)
                                .addGap(18, 18, 18)
                                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jFormattedTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jFormattedTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jFormattedTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jFormattedTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jFormattedTextFieldEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jFormattedTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPesquisar)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonEditar))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonExcluir))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jFormattedTextFieldNome.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "campo nome vazio");
            jFormattedTextFieldNome.requestFocus();
        }else if(jFormattedTextFieldSobrenome.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "campo  matricula vazio");
            jFormattedTextFieldSobrenome.requestFocus();
        }else

        if (flag == 1){
            mod.setTitulo(jFormattedTextFieldTitulo.getText());
            mod.setISBN(jFormattedTextFieldISBN.getText());
            mod.setEdicao(jFormattedTextFieldEdicao.getText());
            mod.setAno(Integer.parseInt(jFormattedTextFieldAno.getText()));
            mod.setArea(jFormattedTextFieldArea.getText());
            mod.setNome(jFormattedTextFieldNome.getText());
            mod.setSobrenome(jFormattedTextFieldSobrenome.getText());

            control.Salvar(mod);
            jtCOD.setText("");
            jFormattedTextFieldTitulo.setText("");
            jFormattedTextFieldISBN.setText("");
            jFormattedTextFieldEdicao.setText("");
            jFormattedTextFieldArea.setText("");
            jFormattedTextFieldAno.setText("");
            jFormattedTextFieldNome.setText("");
            jFormattedTextFieldSobrenome.setText("");

            jFormattedTextFieldTitulo.setEnabled(false);
            jFormattedTextFieldISBN.setEnabled(false);
            jFormattedTextFieldEdicao.setEnabled(false);
            jFormattedTextFieldAno.setEnabled(false);
            jFormattedTextFieldArea.setEnabled(false);
            jFormattedTextFieldNome.setEnabled(false);
            jFormattedTextFieldSobrenome.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            preecherTabelaLivro("select *from alunos order by cod_livro");

        }else{

            mod.setCodigo((Integer.parseInt(jtCOD.getText())));
            mod.setTitulo(jFormattedTextFieldTitulo.getText());
            mod.setISBN(jFormattedTextFieldISBN.getText());
            mod.setEdicao(jFormattedTextFieldEdicao.getText());
            mod.setAno(Integer.parseInt(jFormattedTextFieldAno.getText()));
            mod.setNome(jFormattedTextFieldNome.getText());
            mod.setArea(jFormattedTextFieldArea.getText());
            mod.setSobrenome(jFormattedTextFieldSobrenome.getText());
            control.Editar(mod);
            jtCOD.setText("");
            jFormattedTextFieldTitulo.setText("");
            jFormattedTextFieldISBN.setText("");
            jFormattedTextFieldEdicao.setText("");
            jFormattedTextFieldArea.setText("");
            jFormattedTextFieldAno.setText("");
            jFormattedTextFieldNome.setText("");
            jFormattedTextFieldSobrenome.setText("");

            jFormattedTextFieldTitulo.setEnabled(false);
            jFormattedTextFieldISBN.setEnabled(false);
            jFormattedTextFieldEdicao.setEnabled(false);
            jFormattedTextFieldAno.setEnabled(false);
            jFormattedTextFieldArea.setEnabled(false);
            jFormattedTextFieldNome.setEnabled(false);
            jFormattedTextFieldSobrenome.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            preecherTabelaLivro("select *from livro order by cod_livro");
       
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jFormattedTextFieldTitulo.setEnabled(true);
        jFormattedTextFieldISBN.setEnabled(true);
        jFormattedTextFieldEdicao.setEnabled(true);
        jFormattedTextFieldAno.setEnabled(true);
        jFormattedTextFieldArea.setEnabled(true);
        jFormattedTextFieldNome.setEnabled(true);
        jFormattedTextFieldSobrenome.setEnabled(true);

        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        preecherTabelaLivro("select *from livro order by cod_livro");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa (jTextFieldPesquisa.getText());
        BeansLivro model = control.buscaLivro(mod);

        jtCOD.setText(String.valueOf(model.getCodigo()));

        jFormattedTextFieldTitulo.setText(model.getTitulo());
        jFormattedTextFieldISBN.setText(model.getISBN());
        jFormattedTextFieldEdicao.setText(model.getEdicao());
        jFormattedTextFieldAno.setText(String.valueOf(model.getAno()));
        jFormattedTextFieldArea.setText(model.getArea());
        jFormattedTextFieldNome.setText(model.getNome());
        jFormattedTextFieldSobrenome.setText(model.getSobrenome());
        // jButtonEditar.setEnabled(true);
        //jButtonExcluir.setEnabled(true);
        jtCOD.setText("");
        jFormattedTextFieldTitulo.setText("");
        jFormattedTextFieldISBN.setText("");
        jFormattedTextFieldEdicao.setText("");
        jFormattedTextFieldArea.setText("");
        jFormattedTextFieldAno.setText("");
        jFormattedTextFieldNome.setText("");
        jFormattedTextFieldSobrenome.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.setText("");
        preecherTabelaLivro(("select *from livro where titulo_livro like'%"+mod.getPesquisa()+"%'"));
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        jFormattedTextFieldTitulo.setEnabled(!true);
        jFormattedTextFieldISBN.setEnabled(!true);
        jFormattedTextFieldEdicao.setEnabled(!true);
        jFormattedTextFieldAno.setEnabled(!true);
        jFormattedTextFieldArea.setEnabled(!true);
        jFormattedTextFieldNome.setEnabled(!true);
        jFormattedTextFieldSobrenome.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        
        jButtonEditar.setEnabled(false);
       // jButtonExcluir.setEnabled(false);

        jFormattedTextFieldTitulo.setText("");
        jFormattedTextFieldISBN.setText("");
        jFormattedTextFieldEdicao.setText("");
        jFormattedTextFieldArea.setText("");
        jFormattedTextFieldAno.setText("");
        jFormattedTextFieldNome.setText("");
        jFormattedTextFieldSobrenome.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLivroMouseClicked
        String titulo_livro = ""+ jTableLivro.getValueAt(jTableLivro.getSelectedRow(),1);
        conex.conexao();
        conex.executaSql("select *from livro where titulo_livro = '"+titulo_livro+"'");
        try {
            conex.rs.first();
            jtCOD.setText(String.valueOf(conex.rs.getInt("cod_livro")));

            jFormattedTextFieldTitulo.setText(conex.rs.getString("titulo_livro"));
            jFormattedTextFieldISBN.setText(conex.rs.getString("ISBN_livro"));
            jFormattedTextFieldEdicao.setText(conex.rs.getString("edicao_livro"));
            jFormattedTextFieldAno.setText(conex.rs.getString("ano_livro"));
            jFormattedTextFieldArea.setText(conex.rs.getString("area_livro"));
            jFormattedTextFieldNome.setText(conex.rs.getString("nome_livro"));
            jFormattedTextFieldSobrenome.setText(conex.rs.getString("sobrenome_livro"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar dados"+ex);
        }
        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
       // jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableLivroMouseClicked

    private void jtCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCODActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir? ");
        if (resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jtCOD.getText()));
            control.Excluir(mod);
            jtCOD.setText("");
            jFormattedTextFieldTitulo.setText("");
            jFormattedTextFieldISBN.setText("");
            jFormattedTextFieldEdicao.setText("");
            jFormattedTextFieldArea.setText("");
            jFormattedTextFieldAno.setText("");
            jFormattedTextFieldNome.setText("");
            jFormattedTextFieldSobrenome.setText("");

            jFormattedTextFieldTitulo.setEnabled(false);
            jFormattedTextFieldISBN.setEnabled(false);
            jFormattedTextFieldEdicao.setEnabled(false);
            jFormattedTextFieldAno.setEnabled(false);
            jFormattedTextFieldArea.setEnabled(false);
            jFormattedTextFieldNome.setEnabled(false);
            jFormattedTextFieldSobrenome.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
           // jButtonNovoLivro.setEnabled(true);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preecherTabelaLivro("select *from livro order by cod_livro");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

     public void preecherTabelaLivro(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Titulo","ISBN","Edição","Ano","Área","Nome","Sobrenome"};
        conex.conexao();
        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do{
                dados.add(new Object[] {conex.rs.getInt("cod_livro"),conex.rs.getString("titulo_livro"),conex.rs.getString("isbn_livro"),conex.rs.getString("edicao_livro"), conex.rs.getInt("ano_livro"), conex.rs.getString("area_livro"),conex.rs.getString("nome_livro"), conex.rs.getString("sobrenome_livro")});
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Não há nenhum dado disponível, por favor insira");
        }
        ModeloTabelaLivro modelo = new ModeloTabelaLivro(dados,colunas);
        jTableLivro.setModel(modelo);
        jTableLivro.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTableLivro.getColumnModel().getColumn(0).setResizable(false);
        jTableLivro.getColumnModel().getColumn(1).setPreferredWidth(90); 
        jTableLivro.getColumnModel().getColumn(1).setResizable(false);
        jTableLivro.getColumnModel().getColumn(2).setPreferredWidth(90); 
        jTableLivro.getColumnModel().getColumn(2).setResizable(false);
        jTableLivro.getColumnModel().getColumn(3).setPreferredWidth(90); 
        jTableLivro.getColumnModel().getColumn(3).setResizable(false);
        jTableLivro.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTableLivro.getColumnModel().getColumn(4).setResizable(false);
        jTableLivro.getColumnModel().getColumn(5).setPreferredWidth(90);
        jTableLivro.getColumnModel().getColumn(5).setResizable(false);
        jTableLivro.getColumnModel().getColumn(6).setPreferredWidth(90);
        jTableLivro.getColumnModel().getColumn(6).setResizable(false);
        jTableLivro.getColumnModel().getColumn(7).setPreferredWidth(90);
        jTableLivro.getColumnModel().getColumn(7).setResizable(false);

        
        jTableLivro.getTableHeader().setReorderingAllowed(false);
        jTableLivro.setAutoResizeMode(jTableLivro.AUTO_RESIZE_OFF);
        jTableLivro.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
     }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldAno;
    private javax.swing.JFormattedTextField jFormattedTextFieldArea;
    private javax.swing.JFormattedTextField jFormattedTextFieldEdicao;
    private javax.swing.JFormattedTextField jFormattedTextFieldISBN;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JFormattedTextField jFormattedTextFieldSobrenome;
    private javax.swing.JFormattedTextField jFormattedTextFieldTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLivro;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jtCOD;
    // End of variables declaration//GEN-END:variables
}
