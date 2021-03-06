/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import borse.Acoes;
import borse.Ficheiro;
import borse.Investidor;
import borse.MyDate;
import borse.Oferta;
import borse.Warrants;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Gonçalves
 */
public class ComprarWarrants extends javax.swing.JPanel {

    /**
     * Creates new form warrants
     */
    float val;
    DefaultComboBoxModel lista = new DefaultComboBoxModel();
    Investidor user = new Investidor();

    public ComprarWarrants(Investidor user) {
        initComponents();
        this.user = user;
        Oferta ti = new Oferta();

        for (Warrants aac : Ficheiro.getRepositorio().getWarrants().values()) {
            if(!aac.getOfertaVenda().isEmpty())
            lista.addElement(aac.getSigla());
            this.jComboBox1.setModel(lista);
        }

        val = user.getCarteira().getSaldo() - user.getCarteira().getSaldoInvestido();
        if (this.jComboBox1.getItemCount() > 0) {
            if (Ficheiro.getRepositorio().getWarrants().containsKey(this.jComboBox1.getSelectedItem().toString())) {
                ti = Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek();
                if(ti != null) {
                this.jTextArea1.setText("DinheiroD: " + val + "  DinheiroA: " + user.getCarteira().getSaldo()
+ "\nQta: " + ti.getQuantidade() + "\nPreço: " + ti.getPreco() + "\nPE: " + ti.getWarrant().getPreçoE() + "\nData: " + ti.getWarrant().getInfo() + "\nCall: " + ti.getWarrant().isCall());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLComprarWarrants = new javax.swing.JLabel();
        jLQuantWarrants = new javax.swing.JLabel();
        jTFQuantWarrants = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLWarrants = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBComprar = new javax.swing.JButton();
        jLImagem = new javax.swing.JLabel();

        jLComprarWarrants.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLComprarWarrants.setText("Comprar Warrants");

        jLQuantWarrants.setText("Quantidade Warrants:");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLWarrants.setText("Warrants:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jBComprar.setText("Comprar");
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/warrants2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLImagem)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLQuantWarrants)
                        .addGap(18, 18, 18)
                        .addComponent(jTFQuantWarrants, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLComprarWarrants)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jBComprar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLWarrants)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLComprarWarrants)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLWarrants))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLQuantWarrants)
                            .addComponent(jTFQuantWarrants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jBComprar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLImagem))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
        // TODO add your handling code here:
        float val = 0;
        System.out.println("aumentar saldo" + Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getMorada());
        float valorPagar = 0;
        float preco = 0;
        Warrants aux = new Warrants();
        Oferta xD = new Oferta();
        val = user.getCarteira().getSaldo() - user.getCarteira().getSaldoInvestido();
        
        valorPagar = Integer.parseInt(this.jTFQuantWarrants.getText()) * Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getPreco();
        if (val < valorPagar || Integer.parseInt(this.jTFQuantWarrants.getText()) > Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getQuantidade()) {
            System.out.println("n tem money ou qta baixa " + valorPagar);
            JOptionPane.showMessageDialog(null, "Não tem dinheiro suficiente!");
        } else {
            
            
            xD = Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek();
            xD.setQuantidade(Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getQuantidade() - Integer.parseInt(this.jTFQuantWarrants.getText()));
            preco = Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getPreco();
            if (user.getCarteira().getLW().containsKey(xD.getWarrant().getSigla())) {
                user.getCarteira().getLW().get(xD.getWarrant().getSigla()).setQta(user.getCarteira().getLW().get(xD.getWarrant().getSigla()).getQta() + Integer.parseInt(this.jTFQuantWarrants.getText()));
                
            } else {
                aux.setValidade(xD.getWarrant().getValidade());
                aux.setQta(Integer.parseInt(this.jTFQuantWarrants.getText()));
                aux.setPreco(xD.getPreco());
                aux.setNome(xD.getWarrant().getNome());
                aux.setSigla(xD.getWarrant().getSigla());
                aux.setAc(xD.getAcao());
                aux.setPreçoE(xD.getWarrant().getPreçoE());
                System.out.println("Comprandooooooooo: " + xD.getWarrant().isCall());
                aux.setCall(xD.getWarrant().isCall());
                System.out.println(aux.isCall() + "------------");
                user.getCarteira().getLW().put(xD.getWarrant().getSigla(), aux);
                
            }
            user.getCarteira().getHistorico().put(new Oferta(null, aux, Integer.parseInt(this.jTFQuantWarrants.getText()), preco, null) , 8);
            Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getCarteira().getHistorico().put(new Oferta(null, aux, Integer.parseInt(this.jTFQuantWarrants.getText()), preco, null) , 9);
            user.getCarteira().setSaldo(user.getCarteira().getSaldo() - valorPagar);
            System.out.println("aumentar saldo" + Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getNome());
            Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getCarteira().setSaldo(Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getInv().getCarteira().getSaldo() + valorPagar);
            if(Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek().getQuantidade() == 0) {
            Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().poll();
            }
            
            JOptionPane.showMessageDialog(null, "Compra efetuada!");
        
            
            aux.verifica(user);
        }

    }//GEN-LAST:event_jBComprarActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        Oferta ti = new Oferta();
        if (this.jComboBox1.getItemCount() > 0) {
            if (Ficheiro.getRepositorio().getWarrants().containsKey(this.jComboBox1.getSelectedItem().toString())) {
                ti = Ficheiro.getRepositorio().getWarrants().get(this.jComboBox1.getSelectedItem().toString()).getOfertaVenda().peek();

                this.jTextArea1.setText("DinheiroD: " + val + "  DinheiroA: " + user.getCarteira().getSaldo() + "\nPreço: " + ti.getPreco() + "\nQta: " + ti.getQuantidade() + "\nData: " + ti.getWarrant().getInfo() + "\nPE: " + ti.getWarrant().getPreçoE() + "\nCall: " + ti.getWarrant().isCall());
            }
        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBComprar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLComprarWarrants;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLQuantWarrants;
    private javax.swing.JLabel jLWarrants;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFQuantWarrants;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
