/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import borse.Acoes;
import borse.Ficheiro;
import borse.Investidor;
import borse.Oferta;
import borse.OfertaDeVenda;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class VenderTitulos extends javax.swing.JPanel {

    /**
     * Creates new form ListarClientes
     */
    //DefaultListModel lista = new DefaultListModel();
    DefaultComboBoxModel lista = new DefaultComboBoxModel();
    Investidor user = new Investidor();

    public VenderTitulos(Investidor user) {
        initComponents();
        Acoes ti = new Acoes();
        this.user = user;
        int val;
        for (Acoes aac : user.getCarteira().getAcoes().values()) {
            lista.addElement(aac.getSigla());
            System.out.println("aqui:" + aac.getSigla());
            this.jComboBox1.setModel(lista);
        }

        if (this.jComboBox1.getItemCount() > 0) {
            if (user.getCarteira().getAcoes().containsKey(this.jComboBox1.getSelectedItem().toString())) {
                ti = user.getCarteira().getAcoes().get(this.jComboBox1.getSelectedItem().toString());
               val = ti.getQta() - ti.getQtaInvestida();
            this.jTextArea1.setText("Nome: " + ti.getNome() + "\nPreço: " + ti.getPreco() + "\nQtaD: " + val + "/  QtaT" + ti.getQta() + "\nSigla: " + ti.getSigla());
           
            }
        }

        this.jLabel5.setVisible(false);
        this.jTextTrigger.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBVender = new javax.swing.JButton();
        jLabelSpi = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextPreco = new javax.swing.JTextField();
        jTextQtd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextTrigger = new javax.swing.JTextField();
        jLVenderAção = new javax.swing.JLabel();
        jLImagem = new javax.swing.JLabel();
        jRBSell = new javax.swing.JRadioButton();

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jBVender.setText("Vender");
        jBVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVenderActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Quantidade:");

        jLabel2.setText("Preço:");

        jLabel3.setText("Ação:");

        jTextPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextPrecoFocusLost(evt);
            }
        });

        jTextQtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextQtdFocusLost(evt);
            }
        });
        jTextQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextQtdActionPerformed(evt);
            }
        });

        jLabel4.setText("Ordem:");

        jRadioButton1.setText("Stop Loss");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Trigger:");

        jLVenderAção.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLVenderAção.setText("Vender Ação");

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/venderAçao.jpg"))); // NOI18N

        jRBSell.setText("Vender Já");
        jRBSell.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBSellItemStateChanged(evt);
            }
        });
        jRBSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLImagem)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLVenderAção)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBVender)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRBSell, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextTrigger, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextQtd, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1071, 1071, 1071))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabelSpi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLVenderAção)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(jLabelSpi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextTrigger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLImagem)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(jRBSell))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBVender)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jBVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVenderActionPerformed

        float val1 = 0;
        int val;

        Acoes ti = new Acoes();
        

        if (user.getCarteira().getAcoes().containsKey(this.jComboBox1.getSelectedItem().toString())) {
            ti = user.getCarteira().getAcoes().get(this.jComboBox1.getSelectedItem().toString());
            val = ti.getQta() - ti.getQtaInvestida();
            if (val >= Integer.parseInt(this.jTextQtd.getText())) {
                ti.setQtaInvestida(ti.getQtaInvestida() + Integer.parseInt(this.jTextQtd.getText()));
                System.out.println("tens");
                if (jTextTrigger.getText().isEmpty()) {
                    val1 = 0;
                } else {
                    val1 = Float.parseFloat(jTextTrigger.getText());
                }

                ti = Ficheiro.getRepositorio().getAcao().get(this.jComboBox1.getSelectedItem().toString());
                user.getCarteira().getHistorico().put(new Oferta(user, Integer.parseInt(this.jTextQtd.getText()), Float.parseFloat(this.jTextPreco.getText()), ti), 2);
                ti.criarOfertaVenda(user, Integer.parseInt(this.jTextQtd.getText()), Float.parseFloat(this.jTextPreco.getText()), ti, jRadioButton1.isSelected(), val1, true);
                JOptionPane.showMessageDialog(null, "Ação inserida no mercado com sucesso");
            } else {
                System.out.println("n tens");
                JOptionPane.showMessageDialog(null, "Não tens quantidade suficiente!");
            }
        }


    }//GEN-LAST:event_jBVenderActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        Acoes ti = new Acoes();
        int val;

        if (user.getCarteira().getAcoes().containsKey(this.jComboBox1.getSelectedItem().toString())) {
            ti = user.getCarteira().getAcoes().get(this.jComboBox1.getSelectedItem().toString());
            val = ti.getQta() - ti.getQtaInvestida();
            this.jTextArea1.setText("Nome: " + ti.getNome() + "\nPreço: " + ti.getPreco() + "\nQtaD: " + val + "/  QtaT" + ti.getQta() + "\nSigla: " + ti.getSigla());
            System.out.println("entra");
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextQtdActionPerformed

    private void jTextPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextPrecoFocusLost
        this.calcularValor();
    }//GEN-LAST:event_jTextPrecoFocusLost

    private void jTextQtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextQtdFocusLost
        this.calcularValor();
    }//GEN-LAST:event_jTextQtdFocusLost

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        // TODO add your handling code here:
        if (this.jRadioButton1.isSelected()) {
            this.jLabel5.setVisible(true);
            this.jTextTrigger.setVisible(true);
        } else {
            this.jLabel5.setVisible(false);
            this.jTextTrigger.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRBSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBSellActionPerformed

    private void jRBSellItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBSellItemStateChanged
        // TODO add your handling code here:
        if (this.jRBSell.isSelected() && !Ficheiro.getRepositorio().getAcao().get(this.jComboBox1.getSelectedItem().toString()).getOfertaCompra().isEmpty()) {
            
            
            String x = String.valueOf(Ficheiro.getRepositorio().getAcao().get(this.jComboBox1.getSelectedItem().toString()).getOfertaCompra().peek().getPreco());
            
            this.jTextPreco.setText(x);
            int qtd = Integer.parseInt(this.jTextQtd.getText());
            if (qtd > Ficheiro.getRepositorio().getAcao().get(this.jComboBox1.getSelectedItem().toString()).getOfertaCompra().peek().getQuantidade()) {
                //JOptionPane.showMessageDialog(null, "Quantidade excedida");
                this.jTextQtd.setText(String.valueOf(Ficheiro.getRepositorio().getAcao().get(this.jComboBox1.getSelectedItem().toString()).getOfertaCompra().peek().getQuantidade()));
            }
            this.jTextQtd.setEnabled(false);
            this.jTextPreco.setEnabled(false);

        } else {
            this.jTextQtd.setEnabled(true);
            this.jRBSell.setSelected(false);
            this.jTextPreco.setEnabled(true);
        }
    }//GEN-LAST:event_jRBSellItemStateChanged

    private void calcularValor() {
        int qta;
        float valor;
        System.out.println("ola");
        try {
            qta = Integer.parseInt(this.jTextQtd.getText());
        } catch (NumberFormatException ex) {
            qta = 0;
            System.out.println("erro: " + ex);
        }

        try {
            valor = Float.parseFloat(this.jTextPreco.getText());
        } catch (NumberFormatException ex) {
            valor = 0;
            System.out.println("erro: " + ex);
        }

        valor *= qta;

        this.jLabelValor.setText(Float.toString(valor));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVender;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLVenderAção;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelSpi;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JRadioButton jRBSell;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextPreco;
    private javax.swing.JTextField jTextQtd;
    private javax.swing.JTextField jTextTrigger;
    // End of variables declaration//GEN-END:variables
}
