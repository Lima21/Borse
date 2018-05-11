/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Warrants extends Titulo implements Serializable {

    private float preçoE;
    private MyDate validade;
    private Investidor inv;
    private boolean call;
    private Acoes ac;

    public Warrants(int year, int month, int date) {
        this.validade = new MyDate(year, month, date);
    }

    public Warrants() {
        this.validade = new MyDate();
    }

    public void verifica(Investidor user2) {
        Set<String> x;
        Warrants y;

        MyDate c = Ficheiro.getData();
        float val;
        for (Investidor user : Ficheiro.getRepositorio().getInv().values()) {
            x = user.getCarteira().getLW().keySet();
            Iterator it = x.iterator();
            while (it.hasNext()) {

                y = user.getCarteira().getLW().get(it.next());
                System.out.println("auiiii " + y.isCall());
                if (y.getValidade().after(c)) {
                    System.out.println("depois");
                } else if (y.getValidade().equals(c)) {
                    System.out.println("igual");
                    if (y.isCall()) {
                        System.out.println(y.getPreçoE() + "  .  " + y.getAc().getPreco());
                        System.out.println("entrou call");
                        if (y.getAc().getPreco() >= y.getPreçoE()) {
                            val = y.getAc().getPreco() - y.getPreçoE();
                            val *= y.getQta();
                            System.out.println("Ganhou: " + val);
                            user.getCarteira().setSaldo(user.getCarteira().getSaldo() + val);
                            if (user.getNome().equals(user2.getNome())) {
                                JOptionPane.showMessageDialog(null, "Ganhou: " + val + " com o Warrant");
                            }
                            else {
                                user.getCarteira().getLista().add("Ganhou: " + val + " com o Warrant no dia: " + new Date());
                            }
                            it.remove();
                        } else {
                            if (user.getNome().equals(user2.getNome())) {
                                JOptionPane.showMessageDialog(null, "Perdeu com o Warrant");
                            }
                            else {
                                user.getCarteira().getLista().add("Perdeu com o Warrant no dia: " + new Date());
                            }
                            it.remove();
                        }

                    } else {
                        if (y.getAc().getPreco() <= y.getPreçoE()) {
                            val = y.getPreçoE() - y.getAc().getPreco();
                            val *= y.getQta();
                            System.out.println("Ganhou: " + val);
                            if (user.getNome().equals(user2.getNome())) {
                                JOptionPane.showMessageDialog(null, "Ganhou: " + val + " com o Warrant");
                            }
                            else {
                                user.getCarteira().getLista().add("Ganhou: " + val + " com o Warrant no dia: " + new Date());
                            }
                            user.getCarteira().setSaldo(user.getCarteira().getSaldo() + val);
                            it.remove();
                        } else {
                            if (user.getNome().equals(user2.getNome())) {
                                JOptionPane.showMessageDialog(null, "Perdeu com o Warrant");
                            }
                            else {
                                user.getCarteira().getLista().add("Perdeu com o Warrant no dia: " + new Date());
                            }
                            it.remove();
                        }

                        System.out.println(y.getPreçoE() + "  .  " + y.getAc().getPreco());
                    }

                } else {
                    if (user.getNome().equals(user2.getNome())) {
                        JOptionPane.showMessageDialog(null, "Perdeu com o Warrant");
                    }
                    else {
                        user.getCarteira().getLista().add("Perdeu com o Warrant no dia: " + new Date());
                    }
                    it.remove();
                }
            }
        }
    }

    public Acoes getAc() {
        return ac;
    }

    public void setAc(Acoes ac) {
        this.ac = ac;
    }

    /*
    public void verifica(Investidor user) {
        
        Set<Warrants> x;
        Warrants y;
        x = user.getCarteira().getLW().keySet();
        Iterator it = x.iterator();
        MyDate c = Ficheiro.getData();
        float val;
        while (it.hasNext()) {
            y = (Warrants) it.next();

            switch (user.getCarteira().getLW().get(y)) {
                case 1:
                    if (y.getValidade().after(c)) {
                        System.out.println("depois");
                    } else if (y.getValidade().equals(c)) {
                        System.out.println("igual");
                        if (y.getAc().getPreco() > y.getPreçoW()) {
                            System.out.println(y.getAc().getPreco() + "   "  + y.getPreçoW() + "     "  + y.getQtd());
                            val = y.getAc().getPreco() - y.getPreçoW();
                            val *= y.getQtd();
                             System.out.println("Ganhou: " + val);
                             user.getCarteira().setSaldo(user.getCarteira().getSaldo() + val);
                             JOptionPane.showMessageDialog(null, "Ganhou: " + val + " com o Warrant " + y.getAc().getNome());
                             it.remove();
                             
                        } else {
                            System.out.println("perdeu");
                        }
                    } else {
                        System.out.println("antes");
                        JOptionPane.showMessageDialog(null, "Perdeu o dinheiro investido no Warrant " + y.getAc().getNome());
                        it.remove();
                    }
                    break;
                    
                case 0:
                    if (y.getValidade().after(c)) {
                        System.out.println("depois");
                    } else if (y.getValidade().equals(c)) {
                        System.out.println("igual");
                        if (y.getAc().getPreco() < y.getPreçoW()) {
                            System.out.println(y.getAc().getPreco() + "   "  + y.getPreçoW() + "     "  + y.getQtd());
                            val = y.getPreçoW() - y.getAc().getPreco();
                            val *= y.getQtd();
                             System.out.println("Ganhou: " + val);
                             user.getCarteira().setSaldo(user.getCarteira().getSaldo() + val);
                             JOptionPane.showMessageDialog(null, "Ganhou: " + val + " com o Warrant " + y.getAc().getNome());
                             it.remove();
                        } else {
                            System.out.println("perdeu");
                        }
                    } else {
                        System.out.println("antes");
                        it.remove();
                    }
                    break;

            }
        }

    }*/
    public void criarOfertaVenda(Investidor inv, Warrants war, int qtd, float preco, Acoes ac) {

        OfertaDeVenda ofv = new OfertaDeVenda(inv, war, qtd, preco, ac);
        System.out.println("cirar " + war.isCall());
        this.ofertaVenda.offer(ofv);

    }

    public boolean isCall() {
        return call;
    }

    public void setCall(boolean call) {
        this.call = call;
    }

    public String getInfo() {
        return validade.getDia() + "/" + validade.getMes() + "/" + validade.getAno();
    }

    public MyDate getValidade() {
        return validade;
    }

    public void setValidade(MyDate validade) {
        this.validade = validade;
    }

    public float getPreçoE() {
        return preçoE;
    }

    public void setPreçoE(float preçoE) {
        this.preçoE = preçoE;
    }

    public Investidor getInv() {
        return inv;
    }

    public void setInv(Investidor inv) {
        this.inv = inv;
    }

}
