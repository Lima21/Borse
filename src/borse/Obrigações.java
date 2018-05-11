/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Obrigações extends Titulo implements Serializable {

    private float taxaJuro;
    private MyDate dtfinal;
    private MyDate dtinicial;
    private int anos = 0;

    public Obrigações(int year, int month, int date) {
        this.dtfinal = new MyDate(year, month, date);
        this.dtinicial = new MyDate();
    }

    public Obrigações() {
        this.dtinicial = new MyDate();
    }

    public void verifica(Investidor user2) {
        Set<String> x;
        Obrigações y;
        float val = 0;

        for (Investidor user : Ficheiro.getRepositorio().getInv().values()) {
            x = user.getCarteira().getObg().keySet();
            Iterator it = x.iterator();
            while (it.hasNext()) {
                y = user.getCarteira().getObg().get(it.next());
                if (this.diffDate(y) > y.getAnos()) {
                    user.getCarteira().setSaldo(user.getCarteira().getSaldo() + (y.getTaxaJuro() / 100) * y.getQta() * y.getPreco());
                    this.upAnos(y);
                    System.out.println("sim");
                    val = (y.getTaxaJuro() / 100) * y.getQta() * y.getPreco();
                    if (user.getNome().equals(user2.getNome())) {
                        JOptionPane.showMessageDialog(null, "Ganhou: " + val + " com a Obrigação");
                    }
                    else {
                        user.getCarteira().getLista().add("Ganhou: " + val + " com a Obrigação no dia: " + new Date());
                    }
                } else {
                    System.out.println("n");
                }

                if (this.diffLast(y) <= 0) {
                    user.getCarteira().setSaldo(user.getCarteira().getSaldo() + y.getPreco() * y.getQta());
                    val =  y.getPreco() * y.getQta();
                    if (user.getNome().equals(user2.getNome())) {
                        JOptionPane.showMessageDialog(null, "A Obrigação terminou, foi devolvido o valor: " + val);
                    }
                    else {
                        user.getCarteira().getLista().add("A Obrigação terminou, foi devolvido o valor: " + val + " no dia: "  + new Date());
                    }
                    
                    it.remove();
                }
            }
        }
    }

    private int diffLast(Obrigações y) {
        int val = 0;
        val = y.getDtfinal().getAno() - Ficheiro.getData().getAno();
        return val;
    }

    private int diffDate(Obrigações y) {
        int val = 0;
        val = Ficheiro.getData().getAno() - y.getDtinicial().getAno();
        return val;
    }

    public MyDate getDtfinal() {
        return dtfinal;
    }

    public void setDtfinal(MyDate dtfinal) {
        this.dtfinal = dtfinal;
    }

    public MyDate getDtinicial() {
        return dtinicial;
    }

    public void setDtinicial(MyDate dtinicial) {
        this.dtinicial = dtinicial;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public void upAnos(Obrigações y) {
        y.setAnos(y.getAnos() + 1);
    }

    public String getInfoFinal() {
        return dtfinal.getDia() + "/" + dtfinal.getMes() + "/" + dtfinal.getAno();
    }

    public String getInfoInicial() {
        return dtinicial.getDia() + "/" + dtinicial.getMes() + "/" + dtinicial.getAno();
    }

    public MyDate getValidade() {
        return dtfinal;
    }

    // 
    public void criarOfertaVenda(Investidor inv, Obrigações obg, int qtd, float preco) {

        OfertaDeVenda ofv = new OfertaDeVenda(inv, obg, qtd, preco);
        this.ofertaVenda.offer(ofv);

    }

    /**
     * public float getValorNominal() { return valorNominal; }
     *
     * public void setValorNominal(float valorNominal) { this.valorNominal =
     * valorNominal; }*
     */
    public float getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(float taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

}
