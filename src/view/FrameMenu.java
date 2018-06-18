package view;

import control.ControladorAmbiente;
import control.ControladorCliente;
import control.ControladorFuncionario;
import control.ControladorLocacao;
import control.ControladorLogin;
import control.ControladorRecurso;

public class FrameMenu extends javax.swing.JFrame {

	public FrameMenu() {
		initComponents();
		this.LbFuncionario.setText(ControladorFuncionario.getInstance().funcionarioLogadoNome());
		this.LbTipoFuncionario.setText(ControladorFuncionario.getInstance().funcionarioLogadoTipo());

		if (ControladorFuncionario.getInstance().funcionarioLogadoTipo().equals("Funcionario")) {
			this.BtAmbiente.setEnabled(false);
			this.BtFuncionario.setEnabled(false);
			this.BtRecurso.setEnabled(false);
		}
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LbCoworking = new javax.swing.JLabel();
        BtAmbiente = new javax.swing.JButton();
        BtCliente = new javax.swing.JButton();
        BtFuncionario = new javax.swing.JButton();
        BtLocacao = new javax.swing.JButton();
        BtRecurso = new javax.swing.JButton();
        BtInadinplente = new javax.swing.JButton();
        BtDeslogar = new javax.swing.JButton();
        LbTipoFuncionario = new javax.swing.JLabel();
        LbFuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão Coworking - Menu");
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(720, 480));

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 8, 0};
        jPanel1Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel1.setLayout(jPanel1Layout);

        LbCoworking.setFont(new java.awt.Font("Ubuntu", 0, 32)); // NOI18N
        LbCoworking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbCoworking.setText("Gestão Coworking");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 2.0;
        jPanel1.add(LbCoworking, gridBagConstraints);

        BtAmbiente.setText("Cadastrar e Manter Ambientes");
        BtAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAmbienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtAmbiente, gridBagConstraints);

        BtCliente.setText("Cadastrar e Editar Clientes");
        BtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtCliente, gridBagConstraints);

        BtFuncionario.setText("Cadastrar e Editar Funcionarios");
        BtFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFuncionarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtFuncionario, gridBagConstraints);

        BtLocacao.setText("Cadastrar e Editar Locações");
        BtLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLocacaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtLocacao, gridBagConstraints);

        BtRecurso.setText("Cadastrar e Manter Recursos");
        BtRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRecursoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtRecurso, gridBagConstraints);

        BtInadinplente.setText("Bloquear/Desbloquear Cliente Inadimplente");
        BtInadinplente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInadinplenteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtInadinplente, gridBagConstraints);

        BtDeslogar.setText("Deslogar");
        BtDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeslogarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(BtDeslogar, gridBagConstraints);

        LbTipoFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbTipoFuncionario, gridBagConstraints);

        LbFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(LbFuncionario, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeslogarActionPerformed
		ControladorLogin.getInstance().deslogar();
		this.dispose();
    }//GEN-LAST:event_BtDeslogarActionPerformed

    private void BtFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFuncionarioActionPerformed
		ControladorFuncionario.getInstance().setView(this);
		new FrameFuncionario().setVisible(true);
    }//GEN-LAST:event_BtFuncionarioActionPerformed

    private void BtLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLocacaoActionPerformed
		ControladorLocacao.getInstance().setView(this);
		new FrameLocacao().setVisible(true);
    }//GEN-LAST:event_BtLocacaoActionPerformed

    private void BtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClienteActionPerformed
		ControladorCliente.getInstance().setView(this);
		new FrameCliente().setVisible(true);
    }//GEN-LAST:event_BtClienteActionPerformed

    private void BtInadinplenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInadinplenteActionPerformed
		ControladorCliente.getInstance().setView(this);
		new FrameInadimplencia().setVisible(true);
    }//GEN-LAST:event_BtInadinplenteActionPerformed

    private void BtAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAmbienteActionPerformed
		ControladorAmbiente.getInstance().setView(this);
		new FrameAmbiente().setVisible(true);
    }//GEN-LAST:event_BtAmbienteActionPerformed

    private void BtRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRecursoActionPerformed
		ControladorRecurso.getInstance().setView(this);
		//new FrameRecurso().setVisible(true);
    }//GEN-LAST:event_BtRecursoActionPerformed

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
			java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameMenu().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAmbiente;
    private javax.swing.JButton BtCliente;
    private javax.swing.JButton BtDeslogar;
    private javax.swing.JButton BtFuncionario;
    private javax.swing.JButton BtInadinplente;
    private javax.swing.JButton BtLocacao;
    private javax.swing.JButton BtRecurso;
    private javax.swing.JLabel LbCoworking;
    private javax.swing.JLabel LbFuncionario;
    private javax.swing.JLabel LbTipoFuncionario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
