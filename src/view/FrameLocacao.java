package view;

import control.ControladorAmbiente;
import control.ControladorCliente;
import control.ControladorFuncionario;
import control.ControladorLocacao;
import control.ControladorRecurso;
import control.exceptions.ExceptionInput;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrameLocacao extends javax.swing.JFrame {

    private boolean loaded = false;

    public FrameLocacao() {
        ControladorRecurso.getInstance().novaLocacao();
        initComponents();
        this.TfCusto.setEditable(false);
        this.TfFuncionario.setEditable(false);
        updateComboBox();
        updateLtAdicionado();
        loaded = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LbLocacao = new javax.swing.JLabel();
        CbLocacao = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        LbCliente = new javax.swing.JLabel();
        CbCliente = new javax.swing.JComboBox<>();
        LbAmbiente = new javax.swing.JLabel();
        CbAmbiente = new javax.swing.JComboBox<>();
        LbRecursosAdicionados = new javax.swing.JLabel();
        LbRecursosDisponiveis = new javax.swing.JLabel();
        SpRecursosAdicionados = new javax.swing.JScrollPane();
        LtAdd = new javax.swing.JList<>();
        BtAdiciona = new javax.swing.JButton();
        BtRemove = new javax.swing.JButton();
        SpRecursosDisponiveis = new javax.swing.JScrollPane();
        LtDisp = new javax.swing.JList<>();
        LbDataInicial = new javax.swing.JLabel();
        TfDataInicial = new javax.swing.JTextField();
        LbDataFinal = new javax.swing.JLabel();
        TfDataFinal = new javax.swing.JTextField();
        LbQtdEstacoes = new javax.swing.JLabel();
        TfQtdEstacoes = new javax.swing.JTextField();
        LbCustoTotal = new javax.swing.JLabel();
        TfCusto = new javax.swing.JTextField();
        LbFuncionario = new javax.swing.JLabel();
        TfFuncionario = new javax.swing.JTextField();
        BtSalvar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar e Editar Locacao");
        setLocationByPlatform(true);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setName("Adicionar e Editar Locacao"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        jPanel2.setName(""); // NOI18N
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel2Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel2.setLayout(jPanel2Layout);

        LbLocacao.setText("Identificador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbLocacao, gridBagConstraints);

        CbLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbLocacaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(CbLocacao, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jSeparator1, gridBagConstraints);

        LbCliente.setText("Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbCliente, gridBagConstraints);

        CbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(CbCliente, gridBagConstraints);

        LbAmbiente.setText("Ambiente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbAmbiente, gridBagConstraints);

        CbAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAmbienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(CbAmbiente, gridBagConstraints);

        LbRecursosAdicionados.setText("Recursos Adicionados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbRecursosAdicionados, gridBagConstraints);

        LbRecursosDisponiveis.setText("Recursos Disponiveis");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbRecursosDisponiveis, gridBagConstraints);

        SpRecursosAdicionados.setViewportView(LtAdd);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(SpRecursosAdicionados, gridBagConstraints);

        BtAdiciona.setText("<<");
        BtAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(BtAdiciona, gridBagConstraints);

        BtRemove.setText(">>");
        BtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRemoveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(BtRemove, gridBagConstraints);

        SpRecursosDisponiveis.setViewportView(LtDisp);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(SpRecursosDisponiveis, gridBagConstraints);

        LbDataInicial.setText("Data Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbDataInicial, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(TfDataInicial, gridBagConstraints);

        LbDataFinal.setText("Data Final");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbDataFinal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(TfDataFinal, gridBagConstraints);

        LbQtdEstacoes.setText("Quantidade de Estações");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbQtdEstacoes, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(TfQtdEstacoes, gridBagConstraints);

        LbCustoTotal.setText("Custo Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbCustoTotal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(TfCusto, gridBagConstraints);

        LbFuncionario.setText("Funcionario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(LbFuncionario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(TfFuncionario, gridBagConstraints);

        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(BtSalvar, gridBagConstraints);

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(BtVoltar, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CbLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbLocacaoActionPerformed
        if (evt.getSource() == this.CbLocacao && loaded && this.CbLocacao.getItemCount() != 0) {
            String str = this.CbLocacao.getSelectedItem().toString();
            ArrayList<String> locacao = ControladorLocacao.getInstance().getLocacao(str);
            if (locacao != null) {
                this.updateFields(locacao.get(1), locacao.get(0), locacao.get(2), locacao.get(3), locacao.get(4));
                // update cbCliente
                for (int i = 0; i < this.CbCliente.getItemCount(); i++) {
                    String cliente = this.CbCliente.getItemAt(i);
                    cliente = cliente.substring(0, cliente.indexOf("#"));
                    if (locacao.get(5).equals(cliente)) {
                        this.CbCliente.setSelectedIndex(i);
                        break;
                    }
                }
                // update cbAmbiente
                for (int i = 0; i < this.CbAmbiente.getItemCount(); i++) {
                    if (locacao.get(6).equals((String) this.CbAmbiente.getItemAt(i))) {
                        this.CbAmbiente.setSelectedIndex(i);
                        break;
                    }
                }
                ControladorRecurso.getInstance().loadRecursoLocacao(locacao.get(5), locacao.get(6));
                // update Recursos
                updateLtAdicionado();
            }
            
        }

    }//GEN-LAST:event_CbLocacaoActionPerformed

    private void BtAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionaActionPerformed

        String str = this.LtDisp.getSelectedValue();
        if (str != null) {
            ControladorRecurso.getInstance().addAdicionados(str);
            updateLtAdicionado();
        }

    }//GEN-LAST:event_BtAdicionaActionPerformed

    private void BtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRemoveActionPerformed
        // TODO add your handling code here:
        String str = this.LtAdd.getSelectedValue();
        if (str != null) {
            ControladorRecurso.getInstance().addDisponiveis(str);
            updateLtAdicionado();
        }
    }//GEN-LAST:event_BtRemoveActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        try {
            if (this.CbCliente.getSelectedItem() == null) {
                throw new ExceptionInput("Nenhum cliente selecionado.");
            }
            String cliente = this.CbCliente.getSelectedItem().toString();
            cliente = cliente.substring(0, cliente.indexOf("#"));
            ControladorLocacao.getInstance().salvar(
                this.TfDataFinal.getText(),
                this.TfDataInicial.getText(),
                this.TfQtdEstacoes.getText(),
                this.TfFuncionario.getText(),
                cliente,
                this.CbAmbiente.getSelectedItem().toString());

            ControladorRecurso.getInstance().novaLocacao();
            updateComboBox();
            updateLtAdicionado();
            clearFields();
        } catch (ExceptionInput ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void CbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbClienteActionPerformed

        if (evt.getSource() == this.CbLocacao && loaded) {
            ControladorRecurso.getInstance().loadRecursoLocacao(
                this.CbCliente.getSelectedItem().toString(),
                this.CbAmbiente.getSelectedItem().toString());
        }
        ControladorRecurso.getInstance().novaLocacao();
        
        updateLtAdicionado();
    }//GEN-LAST:event_CbClienteActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        ControladorLocacao.getInstance().exit();
        this.dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void CbAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAmbienteActionPerformed

        ControladorRecurso.getInstance().novaLocacao();
        updateLtAdicionado();
    }//GEN-LAST:event_CbAmbienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdiciona;
    private javax.swing.JButton BtRemove;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JComboBox<String> CbAmbiente;
    private javax.swing.JComboBox<String> CbCliente;
    private javax.swing.JComboBox<String> CbLocacao;
    private javax.swing.JLabel LbAmbiente;
    private javax.swing.JLabel LbCliente;
    private javax.swing.JLabel LbCustoTotal;
    private javax.swing.JLabel LbDataFinal;
    private javax.swing.JLabel LbDataInicial;
    private javax.swing.JLabel LbFuncionario;
    private javax.swing.JLabel LbLocacao;
    private javax.swing.JLabel LbQtdEstacoes;
    private javax.swing.JLabel LbRecursosAdicionados;
    private javax.swing.JLabel LbRecursosDisponiveis;
    private javax.swing.JList<String> LtAdd;
    private javax.swing.JList<String> LtDisp;
    private javax.swing.JScrollPane SpRecursosAdicionados;
    private javax.swing.JScrollPane SpRecursosDisponiveis;
    private javax.swing.JTextField TfCusto;
    private javax.swing.JTextField TfDataFinal;
    private javax.swing.JTextField TfDataInicial;
    private javax.swing.JTextField TfFuncionario;
    private javax.swing.JTextField TfQtdEstacoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void updateComboBox() {
        updateCbCliente();
        updateCbAmbiente();
        updateCbLocacao();
        clearFields();
    }

    private void updateCbLocacao() {
        this.CbLocacao.removeAllItems();
        for (String locacao : ControladorLocacao.getInstance().getAllLocacoes()) {
            this.CbLocacao.addItem(locacao);
        }
    }

    private void updateCbCliente() {
        this.CbCliente.removeAllItems();
        for (String cliente : ControladorCliente.getInstance().getAllClientesLocacao()) {
            this.CbCliente.addItem(cliente);
        }
    }

    private void updateCbAmbiente() {
        this.CbAmbiente.removeAllItems();
        for (String Ambiente : ControladorAmbiente.getInstance().getAllAmbientes()) {
            this.CbAmbiente.addItem(Ambiente);
        }
    }

    private void updateLtAdicionado() {
        this.LtAdd.removeAll();
        this.LtAdd.setListData(new String[0]);
        if (!ControladorRecurso.getInstance().getAdicionados().isEmpty()) {
            this.LtAdd.setListData(this.ArrayToArray(ControladorRecurso.getInstance().getAdicionados()));
        }
        updateCusto();
        updateLtDisponivel();
    }

    private void updateLtDisponivel() {
        this.LtDisp.removeAll();
        this.LtDisp.setListData(new String[0]);
        if (!ControladorRecurso.getInstance().getDisponiveis().isEmpty()) {
            this.LtDisp.setListData(this.ArrayToArray(ControladorRecurso.getInstance().getDisponiveis()));
        }
    }

    private void updateFields(String dataInicial, String dataFinal, String qtdEstacoes, String custo, String funcionario) {
        this.TfDataInicial.setText(dataInicial);
        this.TfDataFinal.setText(dataFinal);
        this.TfQtdEstacoes.setText(qtdEstacoes);
        this.TfCusto.setText(custo);
        if (funcionario != null) {
            this.TfFuncionario.setText(funcionario);
        } else {
            this.TfFuncionario.setText(ControladorFuncionario.getInstance().getFuncionarioLogadoString());
        }
    }

    private void clearFields() {
        updateFields("", "", "", "", null);
    }

    private String[] ArrayToArray(ArrayList<String> array) {
        String[] a = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            a[i] = array.get(i);
        }
        return a;
    }
    
    public void updateCusto() {
        Double custo = 0.0;
        if (this.CbAmbiente.getItemCount() > 0) {
            custo += ControladorAmbiente.getInstance().getCusto(this.CbAmbiente.getSelectedItem().toString());
        }
        custo += ControladorRecurso.getInstance().custoRecursos();
        this.TfCusto.setText(String.valueOf(custo));
    }
}
