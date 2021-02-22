/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import ModeloConection.ConexaoBD;
import ModeloDao.DaoALuno;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansAluno;
import modeloBeans.ModeloTabelaAluno;

/**
 *
 * @author rodri
 */
public class AdmAluno extends javax.swing.JFrame {
    BeansAluno mod = new BeansAluno();
    DaoALuno control = new DaoALuno();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public AdmAluno() {
        initComponents();
         preecherTabelaAluno("select *from alunos order by cod_aluno");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jFormattedTextFieldMatricula = new javax.swing.JFormattedTextField();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldcpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldEndereco = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEnderecoRua = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldEnderecoBairro = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jtCOD = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Curso:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Matricula:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
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

        jButtonPesquisar.setText("Validar aluno");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermagem\t", "Computação", "Ciência da Computação", "Agronomia", "Veterinário", " " }));
        jComboBoxCurso.setEnabled(false);
        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });

        jFormattedTextFieldMatricula.setEnabled(false);
        jFormattedTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldMatriculaActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);

        jFormattedTextFieldcpf.setEnabled(false);
        jFormattedTextFieldcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldcpfActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF:");

        jFormattedTextFieldEndereco.setText("Rua");
        jFormattedTextFieldEndereco.setEnabled(false);
        jFormattedTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldEnderecoActionPerformed(evt);
            }
        });

        jFormattedTextFieldEnderecoRua.setText("n°");
        jFormattedTextFieldEnderecoRua.setEnabled(false);
        jFormattedTextFieldEnderecoRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldEnderecoRuaActionPerformed(evt);
            }
        });

        jLabel7.setText("Endereço:");

        jFormattedTextFieldEnderecoBairro.setText("bairro");
        jFormattedTextFieldEnderecoBairro.setEnabled(false);
        jFormattedTextFieldEnderecoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldEnderecoBairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(6, 6, 6))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButtonPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldEnderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jFormattedTextFieldEnderecoBairro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonPesquisar)
                                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jButtonSalvar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jFormattedTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jFormattedTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jFormattedTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jFormattedTextFieldEnderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButtonCancelar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ADM Alunos");

        jtCOD.setEnabled(false);
        jtCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCODActionPerformed(evt);
            }
        });

        jLabelID.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(322, 322, 322)
                .addComponent(jLabelID)
                .addGap(18, 18, 18)
                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "campo nome vazio");
            jTextFieldNome.requestFocus();
        }else if(jFormattedTextFieldMatricula.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "campo  matricula vazio");
            jFormattedTextFieldMatricula.requestFocus();
        }else

        if (flag == 1){
            mod.setNome(jTextFieldNome.getText());
            mod.setCurso((String) jComboBoxCurso.getSelectedItem());
            mod.setMatricula(Integer.parseInt(jFormattedTextFieldMatricula.getText()));
            mod.setEnderecoAluno(jFormattedTextFieldEndereco.getText());
            mod.setCpfAluno(jFormattedTextFieldcpf.getText());
            mod.setNumEnderecoAluno(Integer.parseInt(jFormattedTextFieldEnderecoRua.getText()));
            mod.setBairroAluno(jFormattedTextFieldEnderecoBairro.getText());
            control.Salvar(mod);
            jtCOD.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldMatricula.setText("");
            jFormattedTextFieldEndereco.setText("");
            jFormattedTextFieldcpf.setText("");
            jFormattedTextFieldEnderecoRua.setText("");
            jFormattedTextFieldEnderecoBairro.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldMatricula.setEnabled(false);
            jComboBoxCurso.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            preecherTabelaAluno("select *from alunos order by cod_aluno");

        }else{

            mod.setCodigo((Integer.parseInt(jtCOD.getText())));
            mod.setNome(jTextFieldNome.getText());
            mod.setCurso((String)jComboBoxCurso.getSelectedItem());
            mod.setMatricula(Integer.parseInt(jFormattedTextFieldMatricula.getText()));
            control.Editar(mod);
            jtCOD.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldMatricula.setText("");
            jFormattedTextFieldEndereco.setText("");
            jFormattedTextFieldcpf.setText("");
            jFormattedTextFieldEnderecoRua.setText("");
            jFormattedTextFieldEnderecoBairro.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldMatricula.setEnabled(false);
            jComboBoxCurso.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir? ");
        if (resposta == JOptionPane.YES_OPTION){
            
            mod.setCodigo(Integer.parseInt(jtCOD.getText()));
            control.Excluir(mod);
            jtCOD.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldMatricula.setText("");
            jFormattedTextFieldEndereco.setText("");
            jFormattedTextFieldcpf.setText("");
            jFormattedTextFieldEnderecoRua.setText("");
            jFormattedTextFieldEnderecoBairro.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldMatricula.setEnabled(false);
            jComboBoxCurso.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);

            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preecherTabelaAluno("select *from alunos order by cod_aluno");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldMatricula.setEnabled(true);

        jFormattedTextFieldEndereco.setEnabled(true);
        jFormattedTextFieldEnderecoBairro.setEnabled(true);
        jFormattedTextFieldEnderecoRua.setEnabled(true);
        jFormattedTextFieldcpf.setEnabled(true);
        jComboBoxCurso.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        preecherTabelaAluno("select *from alunos order by cod_aluno");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa (jTextFieldPesquisa.getText());
        BeansAluno model = control.buscaAluno(mod);

        jtCOD.setText(String.valueOf(model.getCodigo()));
        jTextFieldNome.setText(model.getNome());
        jFormattedTextFieldMatricula.setText(String.valueOf(model.getMatricula()));
        jComboBoxCurso.setSelectedItem(model.getCurso());
        // jButtonEditar.setEnabled(true);
        //jButtonExcluir.setEnabled(true);
        jComboBoxCurso.setSelectedItem("");
        jtCOD.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldMatricula.setText("");
        jFormattedTextFieldcpf.setText("");
        jFormattedTextFieldEnderecoRua.setText("");
        jFormattedTextFieldEnderecoBairro.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.setText("");
        preecherTabelaAluno(("select *from alunos where nome_aluno like'%"+mod.getPesquisa()+"%'"));
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jComboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCursoActionPerformed

    private void jFormattedTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldMatriculaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldMatricula.setEnabled(!true);
        jComboBoxCurso.setEnabled(!true);
        jFormattedTextFieldEndereco.setEnabled(!true);
        jFormattedTextFieldEnderecoBairro.setEnabled(!true);
        jFormattedTextFieldEnderecoRua.setEnabled(!true);
        jFormattedTextFieldcpf.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);

        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldNome.setText("");
        jFormattedTextFieldMatricula.setText("");
        jTextFieldPesquisa.setText("");
        jFormattedTextFieldcpf.setText("");
        jFormattedTextFieldEnderecoRua.setText("");
        jFormattedTextFieldEnderecoBairro.setText("");
        jTextFieldPesquisa.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        String nome_aluno = ""+ jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(),1);
        conex.conexao();
        conex.executaSql("select *from alunos where nome_aluno = '"+nome_aluno+"'");
        try {
            conex.rs.first();
            jtCOD.setText(String.valueOf(conex.rs.getInt("cod_aluno")));
            jTextFieldNome.setText(conex.rs.getString("nome_aluno"));
            jComboBoxCurso.setSelectedItem(conex.rs.getString("curso_aluno"));
            jFormattedTextFieldMatricula.setText(conex.rs.getString("matricula_aluno"));
            jFormattedTextFieldEndereco.setText(conex.rs.getString("endereco_aluno"));
            jFormattedTextFieldcpf.setText(conex.rs.getString("cpf_aluno"));
            jFormattedTextFieldEnderecoRua.setText(conex.rs.getString("numend_aluno"));
            jFormattedTextFieldEnderecoBairro.setText(conex.rs.getString("bairro_aluno"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar dados"+ex);
        }
        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void jFormattedTextFieldcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldcpfActionPerformed

    private void jFormattedTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldEnderecoActionPerformed

    private void jFormattedTextFieldEnderecoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEnderecoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldEnderecoRuaActionPerformed

    private void jFormattedTextFieldEnderecoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEnderecoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldEnderecoBairroActionPerformed

    private void jtCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCODActionPerformed

    /**
     * @param args the command line arguments
     */
    
      public void preecherTabelaAluno(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Curso","Matricula","Endereço","N°","Bairro","CPF"};
        conex.conexao();
        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do{
                dados.add(new Object[] {conex.rs.getInt("cod_aluno"),conex.rs.getString("nome_aluno"),conex.rs.getString("curso_aluno"),conex.rs.getInt("matricula_aluno"), conex.rs.getString("endereco_aluno"), conex.rs.getInt("numend_aluno"),conex.rs.getString("bairro_aluno"), conex.rs.getString("cpf_aluno")});
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Não há nenhum dado disponível, por favor insira");
        }
        ModeloTabelaAluno modelo = new ModeloTabelaAluno(dados,colunas);
        jTableAlunos.setModel(modelo);
        jTableAlunos.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTableAlunos.getColumnModel().getColumn(0).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(1).setPreferredWidth(90); 
        jTableAlunos.getColumnModel().getColumn(1).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(2).setPreferredWidth(90); 
        jTableAlunos.getColumnModel().getColumn(2).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(3).setPreferredWidth(70); 
        jTableAlunos.getColumnModel().getColumn(3).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(4).setPreferredWidth(70); 
        jTableAlunos.getColumnModel().getColumn(4).setResizable(false);
         jTableAlunos.getColumnModel().getColumn(5).setPreferredWidth(70); 
        jTableAlunos.getColumnModel().getColumn(5).setResizable(false);
         jTableAlunos.getColumnModel().getColumn(6).setPreferredWidth(70); 
        jTableAlunos.getColumnModel().getColumn(6).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(7).setPreferredWidth(70); 
        jTableAlunos.getColumnModel().getColumn(7).setResizable(false);

        jTableAlunos.getTableHeader().setReorderingAllowed(false);
        jTableAlunos.setAutoResizeMode(jTableAlunos.AUTO_RESIZE_OFF);
        jTableAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(AdmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JFormattedTextField jFormattedTextFieldEndereco;
    private javax.swing.JFormattedTextField jFormattedTextFieldEnderecoBairro;
    private javax.swing.JFormattedTextField jFormattedTextFieldEnderecoRua;
    private javax.swing.JFormattedTextField jFormattedTextFieldMatricula;
    private javax.swing.JFormattedTextField jFormattedTextFieldcpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jtCOD;
    // End of variables declaration//GEN-END:variables
}
