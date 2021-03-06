package GUI;


import borse.Ficheiro;
import borse.Investidor;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Gonçalves
 */
public class Registo extends javax.swing.JPanel {

    /**
     * Creates new form Registo1
     */
    Investidor user = new Investidor();
    public Registo(Investidor user) {
        initComponents();
        this.jBRegistar.setEnabled(false);
        this.user = user;
        this.jRBadmin.setVisible(false);
        if(user != null && user.isAdmin()) {
            this.jRBadmin.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFMorada = new javax.swing.JTextField();
        jLCCidadão = new javax.swing.JLabel();
        jLIcon = new javax.swing.JLabel();
        jTFCCidadão = new javax.swing.JTextField();
        jLNovoRegisto = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jBRegistar = new javax.swing.JButton();
        jLPassword = new javax.swing.JLabel();
        jTFPassword = new javax.swing.JTextField();
        jLIdade = new javax.swing.JLabel();
        jSIdade = new javax.swing.JSpinner();
        jLMorada = new javax.swing.JLabel();
        jLMsg = new javax.swing.JLabel();
        jRBadmin = new javax.swing.JRadioButton();

        jTFMorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMoradaActionPerformed(evt);
            }
        });

        jLCCidadão.setText("C.Cidadão");

        jLIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user2.png"))); // NOI18N

        jLNovoRegisto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNovoRegisto.setText("Novo Registo");

        jLTelefone.setText("Telefone");

        jLNome.setText("Nome");

        jTFNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNomeFocusLost(evt);
            }
        });
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jBRegistar.setText("Registar");
        jBRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistarActionPerformed(evt);
            }
        });

        jLPassword.setText("Password");

        jLIdade.setText("Idade");

        jLMorada.setText("Morada");

        jRBadmin.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBRegistar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLIcon)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLMorada)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNome)
                                    .addComponent(jLPassword)
                                    .addComponent(jLIdade))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCCidadão)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCCidadão))
                            .addComponent(jLNovoRegisto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTelefone)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRBadmin))))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLNovoRegisto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPassword)
                            .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLIdade)
                            .addComponent(jSIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLMorada))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCCidadão)
                            .addComponent(jTFCCidadão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefone)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBRegistar)
                            .addComponent(jRBadmin)))
                    .addComponent(jLIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFMoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMoradaActionPerformed

    private void jBRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistarActionPerformed
        if (Ficheiro.getRepositorio().getInv() == null)
            Ficheiro.getRepositorio().setInv(new HashMap<>());
        Investidor inv = new Investidor();
        inv.setNome(this.jTFNome.getText());
        inv.setIdade((Integer)jSIdade.getValue());
        inv.setNumCartao(Integer.parseInt(jTFCCidadão.getText()));
        inv.setMorada(jTFMorada.getText());
        inv.setPassword(this.jTFPassword.getText());
        inv.setTelefone(Integer.parseInt(this.jTFTelefone.getText()));
        inv.setAdmin(false);
        Ficheiro.getRepositorio().getInv().put(this.jTFNome.getText(), inv);
        if(user != null && user.isAdmin()) {
            inv.setAdmin(this.jRBadmin.isSelected());
        }
        
        Ficheiro.serializar("te");
        JOptionPane.showMessageDialog(null, "Registo efetuado com sucesso");
        ((BemVindo)this.getParent().getParent().getParent()).loginBack();
    }//GEN-LAST:event_jBRegistarActionPerformed

    private void jTFNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNomeFocusLost

        if(Ficheiro.getRepositorio().getInv().containsKey(this.jTFNome.getText()))
            this.jBRegistar.setEnabled(false);
        else
            this.jBRegistar.setEnabled(true);
    }//GEN-LAST:event_jTFNomeFocusLost

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegistar;
    private javax.swing.JLabel jLCCidadão;
    private javax.swing.JLabel jLIcon;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLMorada;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNovoRegisto;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JRadioButton jRBadmin;
    private javax.swing.JSpinner jSIdade;
    private javax.swing.JTextField jTFCCidadão;
    private javax.swing.JTextField jTFMorada;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPassword;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
