/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import borse.Acoes;
import borse.Ficheiro;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class CriarAcoes extends javax.swing.JPanel {

    /**
     * Creates new form CriarAcoes
     */

    public CriarAcoes() {
        initComponents();
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextSigla = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jBCriar = new javax.swing.JButton();
        jLCriarAção = new javax.swing.JLabel();
        jLImagem = new javax.swing.JLabel();

        jLabel2.setText("Sigla:");

        jLabel3.setText("Nome:");

        jTextSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSiglaActionPerformed(evt);
            }
        });

        jBCriar.setText("Criar");
        jBCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarActionPerformed(evt);
            }
        });

        jLCriarAção.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLCriarAção.setText("Criar Ação");

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ação.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLImagem)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jLCriarAção)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextSigla, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(jTextNome))
                    .addComponent(jBCriar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLImagem)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLCriarAção)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(34, 34, 34)
                        .addComponent(jBCriar)
                        .addGap(55, 55, 55)))
                .addGap(175, 175, 175))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSiglaActionPerformed

    private void jBCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarActionPerformed
        if (Ficheiro.getRepositorio().getInv() == null)
            Ficheiro.getRepositorio().setInv(new HashMap<>());
        Acoes ac = new Acoes();
        ac.setNome(this.jTextNome.getText());
        ac.setPreco(0);
        ac.setQta(0);
        ac.setSigla(this.jTextSigla.getText());
        Ficheiro.getRepositorio().getAcao().put(this.jTextSigla.getText(), ac);
        JOptionPane.showMessageDialog(null, "Ação criada com sucesso");
    }//GEN-LAST:event_jBCriarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCriar;
    private javax.swing.JLabel jLCriarAção;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextSigla;
    // End of variables declaration//GEN-END:variables
}
