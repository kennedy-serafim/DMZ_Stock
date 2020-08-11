package com.dmz.stock.view;

import configuracoes.SystemMessage;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public class RecuperacaoSenha extends javax.swing.JDialog {

    /**
     * Creates new form RecoveryPass
     *
     * @param parent
     * @param modal
     */
    public RecuperacaoSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        configuracoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxEmail = new javax.swing.JCheckBox();
        jCheckBoxPerguntas = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblClicaAqui = new javax.swing.JLabel();
        btnAvancar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Recuperação da Conta do Usuário");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setText("Escolha Um dos Métodos De Recuperação abaixo");

        jPanel1.setBackground(new java.awt.Color(26, 118, 141));

        jCheckBoxEmail.setBackground(new java.awt.Color(26, 118, 141));
        buttonGroup1.add(jCheckBoxEmail);
        jCheckBoxEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCheckBoxEmail.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxEmail.setText("Recuperação Por E-Mail");
        jCheckBoxEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBoxPerguntas.setBackground(new java.awt.Color(26, 118, 141));
        buttonGroup1.add(jCheckBoxPerguntas);
        jCheckBoxPerguntas.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCheckBoxPerguntas.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPerguntas.setText("Recuperação Por Perguntas de Segurança");
        jCheckBoxPerguntas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxPerguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPerguntasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Já recebeu o código de confirmação?");

        lblClicaAqui.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblClicaAqui.setForeground(new java.awt.Color(255, 255, 255));
        lblClicaAqui.setText("Clica aqui.");
        lblClicaAqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClicaAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClicaAquiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClicaAquiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClicaAquiMouseExited(evt);
            }
        });

        btnAvancar.setBackground(new java.awt.Color(0, 153, 255));
        btnAvancar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account-logout-16.png"))); // NOI18N
        btnAvancar.setText("Avançar");
        btnAvancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 0, 0));
        btnSair.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account-logout-16.png"))); // NOI18N
        btnSair.setText("Voltar");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblClicaAqui)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBoxEmail)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxPerguntas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvancar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxEmail)
                    .addComponent(jCheckBoxPerguntas))
                .addGap(40, 40, 40)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblClicaAqui))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jLabel1)
                            .addGap(136, 136, 136))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxPerguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPerguntasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPerguntasActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        new Index().setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void lblClicaAquiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClicaAquiMouseEntered
        lblClicaAqui.setForeground(Color.yellow);
    }//GEN-LAST:event_lblClicaAquiMouseEntered

    private void lblClicaAquiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClicaAquiMouseExited
        lblClicaAqui.setForeground(Color.white);
    }//GEN-LAST:event_lblClicaAquiMouseExited

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        if (!jCheckBoxEmail.isSelected() && !jCheckBoxPerguntas.isSelected()) {
            //Se nada estiver selecionado
            JOptionPane.showMessageDialog(this,
                    "Selecione um dos métodos de recuperação de conta para continuar",
                    SystemMessage.SYSTEM_NAME, JOptionPane.WARNING_MESSAGE);

        } else if (jCheckBoxEmail.isSelected()) {
            //Se Recuperação por email estiver selecionado
            int confirmacao = JOptionPane.showConfirmDialog(this,
                    "Pretende efectuar a recuperação de conta através do Endereço Electronico?",
                    SystemMessage.SYSTEM_NAME, JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                this.dispose();
            }

        } else if (jCheckBoxPerguntas.isSelected()) {
            //Se Recuperação por pergunta estiver selecionado
            int confirmacao = JOptionPane.showConfirmDialog(this,
                    "Pretende efectuar a recuperação de conta através de Pergunta de Segurança?",
                    SystemMessage.SYSTEM_NAME, JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                this.dispose();

            }
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void lblClicaAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClicaAquiMouseClicked
        this.dispose();
        JOptionPane.showMessageDialog(this,
                "Digite o login de acesso e o código de confirmação enviado para o seu Endereço Electrónico",
                SystemMessage.SYSTEM_NAME, JOptionPane.INFORMATION_MESSAGE);
        new Codigo_Confirmacao(null, true).setVisible(true);
    }//GEN-LAST:event_lblClicaAquiMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            RecuperacaoSenha dialog = new RecuperacaoSenha(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBoxEmail;
    private javax.swing.JCheckBox jCheckBoxPerguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClicaAqui;
    // End of variables declaration//GEN-END:variables

    private void configuracoes() {
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource(SystemMessage.IMAGE_URL)).getImage());
        this.setTitle(SystemMessage.SYSTEM_NAME + " -");
    }

}
