package view;

import control.ControladorCliente;
import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrameCliente extends javax.swing.JFrame {

    private boolean loaded = false;

    public FrameCliente() {
        initComponents();
        updateComboBox();
        loaded = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LbCliente = new javax.swing.JLabel();
        CbCliente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        LbNome = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        LbCpf = new javax.swing.JLabel();
        TfCpf = new javax.swing.JTextField();
        LbEndereco = new javax.swing.JLabel();
        LbSenha2 = new javax.swing.JLabel();
        BtSalvar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();
        LbInadimplencia = new javax.swing.JLabel();
        TfEndereco = new javax.swing.JTextField();
        LbInadimplente = new javax.swing.JLabel();
        LbAtividade = new javax.swing.JLabel();
        LbAnos = new javax.swing.JLabel();
        TfAtividade = new javax.swing.JTextField();
        TfIdade = new javax.swing.JTextField();
        LbObservação = new javax.swing.JLabel();
        TfObservação = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar e manter clientes");
        setMaximumSize(null);

        jPanel1.setMaximumSize(null);
        jPanel1.setMinimumSize(null);
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(null);
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel1Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel1.setLayout(jPanel1Layout);

        LbCliente.setFont(LbCliente.getFont().deriveFont((float)12));
        LbCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbCliente.setText("Clientes");
        LbCliente.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbCliente, gridBagConstraints);

        CbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(CbCliente, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jSeparator1, gridBagConstraints);

        LbNome.setFont(LbNome.getFont().deriveFont((float)12));
        LbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbNome.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbNome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfNome, gridBagConstraints);

        LbCpf.setFont(LbCpf.getFont().deriveFont((float)12));
        LbCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbCpf.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbCpf, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfCpf, gridBagConstraints);

        LbEndereco.setFont(LbEndereco.getFont().deriveFont((float)12));
        LbEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbEndereco.setText("Endereço");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbEndereco, gridBagConstraints);

        LbSenha2.setFont(LbSenha2.getFont().deriveFont((float)12));
        LbSenha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbSenha2.setText("Idade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbSenha2, gridBagConstraints);

        BtSalvar.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtSalvar, gridBagConstraints);

        BtVoltar.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtVoltar, gridBagConstraints);

        LbInadimplencia.setFont(LbInadimplencia.getFont().deriveFont((float)12));
        LbInadimplencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbInadimplencia.setText("Inadimplência");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbInadimplencia, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfEndereco, gridBagConstraints);

        LbInadimplente.setFont(LbInadimplente.getFont().deriveFont((float)12));
        LbInadimplente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbInadimplente.setText("sim");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbInadimplente, gridBagConstraints);

        LbAtividade.setFont(LbAtividade.getFont().deriveFont((float)12));
        LbAtividade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbAtividade.setText("Atividade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbAtividade, gridBagConstraints);

        LbAnos.setFont(LbAnos.getFont().deriveFont((float)12));
        LbAnos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbAnos.setText("anos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbAnos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfAtividade, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfIdade, gridBagConstraints);

        LbObservação.setFont(LbObservação.getFont().deriveFont((float)12));
        LbObservação.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbObservação.setText("Observação");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbObservação, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfObservação, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        try {
            ControladorCliente.getInstance().salvar(
                this.TfAtividade.getText(),
                this.TfCpf.getText(),
                this.TfEndereco.getText(),
                false,
                Integer.valueOf(this.TfIdade.getText()),
                this.TfNome.getText(),
                this.TfObservação.getText());
        } catch (ExceptionSalvoComSucesso ex) {
            updateComboBox();
        } catch (ExceptionInput ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ExceptionCancelar ex) {

        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void CbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbClienteActionPerformed
        if (evt.getSource() == this.CbCliente && loaded && this.CbCliente.getItemCount() != 0) {
            String str = this.CbCliente.getSelectedItem().toString();
            str = str.substring(0, str.indexOf("#"));
            ArrayList<String> cliente = ControladorCliente.getInstance().getClienteView(str);
            updateFields(
                cliente.get(0),
                cliente.get(1), 
                cliente.get(2), 
                cliente.get(3), 
                cliente.get(4), 
                cliente.get(5), 
                cliente.get(6));
        }

    }//GEN-LAST:event_CbClienteActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed

        ControladorCliente.getInstance().exit();
        this.dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSalvar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JComboBox<String> CbCliente;
    private javax.swing.JLabel LbAnos;
    private javax.swing.JLabel LbAtividade;
    private javax.swing.JLabel LbCliente;
    private javax.swing.JLabel LbCpf;
    private javax.swing.JLabel LbEndereco;
    private javax.swing.JLabel LbInadimplencia;
    private javax.swing.JLabel LbInadimplente;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbObservação;
    private javax.swing.JLabel LbSenha2;
    private javax.swing.JTextField TfAtividade;
    private javax.swing.JTextField TfCpf;
    private javax.swing.JTextField TfEndereco;
    private javax.swing.JTextField TfIdade;
    private javax.swing.JTextField TfNome;
    private javax.swing.JTextField TfObservação;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void updateComboBox() {
        this.CbCliente.removeAllItems();
        for (String cliente : ControladorCliente.getInstance().getAllClientes()) {
            this.CbCliente.addItem(cliente);
        }
        clearFields();
    }

    private void updateFields(String Atividade, String cpf, String endereco, String estaInadimplente, String idade, String nome, String observacao) {
        this.TfAtividade.setText(Atividade);
        this.TfCpf.setText(cpf);
        this.TfEndereco.setText(endereco);
        switch (estaInadimplente) {
            case "true":
                this.LbInadimplente.setText("sim");
                break;
            case "false":
                this.LbInadimplente.setText("não");
                break;
            default:
                this.LbInadimplente.setText("");
                break;
        }
        this.TfIdade.setText(idade);
        this.TfNome.setText(nome);
        this.TfObservação.setText(observacao);
    }

    private void clearFields() {
        updateFields("", "", "", "", "", "", "");
    }
}
