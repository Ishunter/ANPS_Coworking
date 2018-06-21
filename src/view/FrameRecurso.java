package view;

import control.ControladorRecurso;
import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionExcluidoComSucesso;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrameRecurso extends javax.swing.JFrame {

    private boolean loaded = false;

    public FrameRecurso() {
        initComponents();
        updateComboBox();
        loaded = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LbRecurso = new javax.swing.JLabel();
        CbRecurso = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        LbNome = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        LbCusto = new javax.swing.JLabel();
        TfCusto = new javax.swing.JTextField();
        LbDescricao = new javax.swing.JLabel();
        BtSalvar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();
        TfDescricao = new javax.swing.JTextField();
        BtExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar e editar funcionarios");
        setMinimumSize(new java.awt.Dimension(720, 480));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        LbRecurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbRecurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbRecurso.setText("Recurso");
        LbRecurso.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbRecurso, gridBagConstraints);

        CbRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbRecursoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(CbRecurso, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jSeparator1, gridBagConstraints);

        LbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbNome.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbNome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfNome, gridBagConstraints);

        LbCusto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCusto.setText("Custo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbCusto, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfCusto, gridBagConstraints);

        LbDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbDescricao.setText("Descrição");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbDescricao, gridBagConstraints);

        BtSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtSalvar, gridBagConstraints);

        BtVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtVoltar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 2.0;
        jPanel1.add(TfDescricao, gridBagConstraints);

        BtExcluir.setText("Excluir");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtExcluir, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CbRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbRecursoActionPerformed
        if (evt.getSource() == this.CbRecurso && loaded && this.CbRecurso.getItemCount() != 0) {
            ArrayList<String> recurso = ControladorRecurso.getInstance().getRecursoView(this.CbRecurso.getSelectedItem().toString());
            updateFields(recurso.get(0), recurso.get(1), recurso.get(2));
        }
    }//GEN-LAST:event_CbRecursoActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        try {
            ControladorRecurso.getInstance().salvar(
                this.TfNome.getText(),
                this.TfCusto.getText(),
                this.TfDescricao.getText());
        } catch (ExceptionSalvoComSucesso ex) {
            updateComboBox();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ExceptionInput ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ExceptionCancelar ex) {

        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        ControladorRecurso.getInstance().exit();
        this.dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        try {
            ControladorRecurso.getInstance().excluir(this.CbRecurso.getSelectedItem().toString());
        } catch (ExceptionExcluidoComSucesso ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ExceptionInput ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        updateComboBox();
    }//GEN-LAST:event_BtExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FrameRecurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRecurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRecurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRecurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrameRecurso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JComboBox<String> CbRecurso;
    private javax.swing.JLabel LbCusto;
    private javax.swing.JLabel LbDescricao;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbRecurso;
    private javax.swing.JTextField TfCusto;
    private javax.swing.JTextField TfDescricao;
    private javax.swing.JTextField TfNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void updateComboBox() {
        this.CbRecurso.removeAllItems();
        for (String r : ControladorRecurso.getInstance().loadRecursosView()) {
            this.CbRecurso.addItem(r);
        }
        clearFields();
    }

    private void updateFields(String custo, String descricao, String nome) {
        this.TfNome.setText(nome);
        this.TfCusto.setText(custo);
        this.TfDescricao.setText(descricao);
    }

    private void clearFields() {
        updateFields("", "", "");
    }
}
