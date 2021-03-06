/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import borse.Ficheiro;
import borse.Investidor;
import borse.Obrigações;
import borse.Oferta;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Gonçalves
 */
public class ComprarObrigações extends javax.swing.JPanel {
    DefaultComboBoxModel lista = new DefaultComboBoxModel();
    Investidor user = new Investidor();
    float val;
    public ComprarObrigações(Investidor user) {
        this.user = user;
        Oferta obg = new Oferta();
        initComponents();
        
        for (Obrigações aac : Ficheiro.getRepositorio().getObrigações().values()) {
            System.out.println(aac.getNome() + aac.getSigla()+aac.getQta()+aac.getTaxaJuro()+aac.getPreco());
            if(!aac.getOfertaVenda().isEmpty())
            lista.addElement(aac.getSigla());
            this.jComboBox1.setModel(lista);
        }
        
        val = user.getCarteira().getSaldo() - user.getCarteira().getSaldoInvestido();
        if (this.jComboBox1.getItemCount() > 0) {
            if (Ficheiro.getRepositorio().getObrigações().containsKey(this.jComboBox1.getSelectedItem().toString())) {
                obg = Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek();
                if(obg != null) {
                this.jTextArea1.setText("DinherioD: " + val + " Dinheiro: " +user.getCarteira().getSaldo()  + "\nNome: "+ obg.getObrigação().getNome()+"\nQta: " + obg.getQuantidade() + "\nPreço: " + obg.getPreco() + "\nTaxa Juro: " + obg.getObrigação().getTaxaJuro());
                
                }
            }

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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLQuantidade = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jBComprar = new javax.swing.JButton();
        jLObrigações = new javax.swing.JLabel();
        jLComprarOb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLQuantidade.setText("Quantidade");

        jBComprar.setText("Comprar");
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });

        jLObrigações.setText("Obrigações");

        jLComprarOb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLComprarOb.setText("Comprar Obrigação");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/avencas_contratos.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBComprar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLQuantidade)
                                .addComponent(jLObrigações))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFQuantidade)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLComprarOb))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 203, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(244, Short.MAX_VALUE)
                        .addComponent(jLComprarOb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLObrigações))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLQuantidade)
                            .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jBComprar)))
                .addGap(202, 202, 202))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
        Oferta obg = new Oferta();
         if (this.jComboBox1.getItemCount() > 0) {
            if (Ficheiro.getRepositorio().getObrigações().containsKey(this.jComboBox1.getSelectedItem().toString())) {
                obg = Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek();
                if(obg != null) {
                 this.jTextArea1.setText("DinherioD: " + val + " Dinheiro: " +user.getCarteira().getSaldo()  + "\nNome: "+ obg.getObrigação().getNome()+"\nQta: " + obg.getQuantidade() + "\nPreço: " + obg.getPreco() + "\nTaxa Juro: " + obg.getObrigação().getTaxaJuro());
                
                }
            }

        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
        float val = 0;
        float valorPagar = 0;
        Obrigações  ti = new Obrigações();
        Obrigações aux = new Obrigações();
        Oferta xD = new Oferta();
        val = user.getCarteira().getSaldo() - user.getCarteira().getSaldoInvestido();
        
        valorPagar = Integer.parseInt(this.jTFQuantidade.getText()) * Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getPreco();
        if (val < valorPagar || Integer.parseInt(this.jTFQuantidade.getText()) > Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getQuantidade()) {
            System.out.println("n tem money");
            JOptionPane.showMessageDialog(null, "Não tem dinheiro suficiente!");
        } else {
            
            
            xD = Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek();
            xD.setQuantidade(Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getQuantidade() - Integer.parseInt(this.jTFQuantidade.getText()));
            if (user.getCarteira().getObg().containsKey(xD.getObrigação().getSigla())) {
                user.getCarteira().getObg().get(xD.getObrigação().getSigla()).setQta(user.getCarteira().getObg().get(xD.getObrigação().getSigla()).getQta() + Integer.parseInt(this.jTFQuantidade.getText()));
                
            } else {
              
                aux.setQta(Integer.parseInt(this.jTFQuantidade.getText()));
                aux.setPreco(xD.getPreco());
                aux.setNome(xD.getObrigação().getNome());
                aux.setSigla(xD.getObrigação().getSigla());
                aux.setPreco(xD.getObrigação().getPreco());
                aux.setTaxaJuro(xD.getObrigação().getTaxaJuro());
                aux.setDtfinal(xD.getObrigação().getDtfinal());
                aux.setDtinicial(xD.getObrigação().getDtinicial());
                user.getCarteira().getObg().put(xD.getObrigação().getSigla(), aux);
                
                
            }
            
            aux.setQta(Integer.parseInt(this.jTFQuantidade.getText()));
                aux.setPreco(xD.getPreco());
                aux.setNome(xD.getObrigação().getNome());
                aux.setSigla(xD.getObrigação().getSigla());
            user.getCarteira().getHistorico().put(new Oferta(null, aux, Integer.parseInt(this.jTFQuantidade.getText()), aux.getPreco()) , 11);
            Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getCarteira().getHistorico().put(new Oferta(null, aux, Integer.parseInt(this.jTFQuantidade.getText()), aux.getPreco()) , 12);
            user.getCarteira().setSaldo(user.getCarteira().getSaldo() - valorPagar);
            Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getCarteira().setSaldo(Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getCarteira().getSaldo() + valorPagar);
            
            if(Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getQuantidade() == 0) {
            Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().poll();
                System.out.println("retira");
                JOptionPane.showMessageDialog(null, "Apaga!");
                for(Oferta u : Ficheiro.getRepositorio().getObrigações().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda())
                    System.out.println(u.getObrigação().getNome() + "  merda");
            }
            
            JOptionPane.showMessageDialog(null, "Compra efetuada!");
           
        }
   
    }//GEN-LAST:event_jBComprarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComprar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLComprarOb;
    private javax.swing.JLabel jLObrigações;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}