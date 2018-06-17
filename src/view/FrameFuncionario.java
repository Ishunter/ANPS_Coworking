package view;

import control.ControladorFuncionario;
import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrameFuncionario extends javax.swing.JFrame {

	private boolean loaded = false;

	public FrameFuncionario() {
		initComponents();
		updateComboBox();
		loaded = true;
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LbFuncionario = new javax.swing.JLabel();
        CbFuncionario = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        LbNome = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        LbLogin = new javax.swing.JLabel();
        TfLogin = new javax.swing.JTextField();
        LbSenha1 = new javax.swing.JLabel();
        PfSenha1 = new javax.swing.JPasswordField();
        LbSenha2 = new javax.swing.JLabel();
        PfSenha2 = new javax.swing.JPasswordField();
        BtSalvar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar e editar funcionarios");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        LbFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbFuncionario.setText("Funcionario");
        LbFuncionario.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbFuncionario, gridBagConstraints);

        CbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbFuncionarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(CbFuncionario, gridBagConstraints);
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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfNome, gridBagConstraints);

        LbLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbLogin.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbLogin, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(TfLogin, gridBagConstraints);

        LbSenha1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbSenha1.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbSenha1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(PfSenha1, gridBagConstraints);

        LbSenha2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbSenha2.setText("Confirmar Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbSenha2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(PfSenha2, gridBagConstraints);

        BtSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtSalvar, gridBagConstraints);

        BtVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtVoltar.setText("Voltar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtVoltar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbFuncionarioActionPerformed
		if (evt.getSource() == this.CbFuncionario && loaded && this.CbFuncionario.getItemCount() != 0) {
			String str = this.CbFuncionario.getSelectedItem().toString();
			str = str.substring(0, str.indexOf("#"));
			ArrayList<String> funcionario = ControladorFuncionario.getInstance().getFuncionario(str);
			updateFields(funcionario.get(0), funcionario.get(1), funcionario.get(2));
		}
    }//GEN-LAST:event_CbFuncionarioActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
		try {
			ControladorFuncionario.getInstance().salvar(TfLogin.getText(),
				TfNome.getText(),
				String.valueOf(PfSenha1.getPassword()),
				String.valueOf(PfSenha2.getPassword()));
		} catch (ExceptionSalvoComSucesso ex) {
			updateComboBox();
		} catch (ExceptionInput ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		} catch (ExceptionCancelar ex) {

		}
    }//GEN-LAST:event_BtSalvarActionPerformed

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
			java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new FrameFuncionario().setVisible(true);
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSalvar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JComboBox<String> CbFuncionario;
    private javax.swing.JLabel LbFuncionario;
    private javax.swing.JLabel LbLogin;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbSenha1;
    private javax.swing.JLabel LbSenha2;
    private javax.swing.JPasswordField PfSenha1;
    private javax.swing.JPasswordField PfSenha2;
    private javax.swing.JTextField TfLogin;
    private javax.swing.JTextField TfNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

	private void updateComboBox() {
		this.CbFuncionario.removeAllItems();
		for (String funcionario : ControladorFuncionario.getInstance().getAllFuncionarios()) {
			this.CbFuncionario.addItem(funcionario);
		}
		clearFields();
	}

	private void updateFields(String login, String nome, String senha) {
		this.TfLogin.setText(login);
		this.TfNome.setText(nome);
		this.PfSenha1.setText(senha);
		this.PfSenha2.setText(senha);
	}

	private void clearFields() {
		updateFields("", "", "");
	}
}
