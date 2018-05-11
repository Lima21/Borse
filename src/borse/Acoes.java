/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author admin
 */
public class Acoes extends Titulo implements Serializable {

    private PriorityQueue<OfertaDeVenda> ofertaVendaTrigger;
    private PriorityQueue<OfertaDeCompra> ofertaCompraTrigger;
    private Map<MyDate, Float> valores;

    /* Será que precisa? 
    
    private int QtaDispersa;
     */
    public Acoes() {

        ofertaVendaTrigger = new PriorityQueue<>();
        ofertaCompraTrigger = new PriorityQueue<>();
        valores = new HashMap<>();

    }

    private void trigge(Acoes ac) {

        for (OfertaDeVenda c : ac.getOfertaVendaTrigger()) {
            if (ac.getPreco() <= c.getPrecoTrigger()) {
                System.out.println("cria");
                ac.criarOfertaVenda(c.getInv(), c.getQuantidade(), c.getPreco(), c.getAcao(), false, 0, false);
                System.out.println(this.ofertaVendaTrigger.remove(c));
                System.out.println("----------------------");
                for (OfertaDeVenda x : ac.getOfertaVendaTrigger()) {
                    System.out.println("------------fdsfsd-----------");
                    System.out.println("oferta: " + x.getPrecoTrigger());
                }

            } else {
                System.out.println("nd passa");
            }
        }

        for (OfertaDeCompra c : ac.getOfertaCompraTrigger()) {
            if (ac.getPreco() >= c.getPrecoTrigger()) {
                ac.criarOfertaCompra(c.getInv(), c.getQuantidade(), c.getPreco(), c.getAcao(), false, 0, false);
                this.ofertaCompraTrigger.remove(c);
            } else {
                System.out.println("nd passa");
            }
        }

    }

    private void distribui(Acoes ac, int qtd, float preco) {
        boolean existe = false;
        float valorTotal;
        Acoes xp = new Acoes();
        int qtaTotal;
        Acoes ti, ti2 = new Acoes();
        if (ac.getOfertaCompra().peek().getInv().getCarteira().getAcoes().containsKey(ac.getSigla())) {
            existe = true;
        }

        if (!existe || ac.getOfertaCompra().peek().getInv().getCarteira().getAcoes().isEmpty()) {

            xp.setQta(0);
            xp.setSigla(ac.getSigla());
            xp.setNome(ac.getNome());

            ac.getOfertaCompra().peek().getInv().getCarteira().getAcoes().put(ac.getSigla(), xp);
        }

        //ADD ao Comprador
        ti = ac.getOfertaCompra().peek().getInv().getCarteira().getAcoes().get(ac.getOfertaCompra().peek().getAcao().getSigla());
        valorTotal = ti.getPreco() * ti.getQta() + qtd * preco;
        valorTotal /= (ti.getQta() + qtd);
        ac.getOfertaCompra().peek().getInv().getCarteira().getLista().add("Adquiriu: " + qtd + " pelo valor de: " + preco);
        ac.getOfertaVenda().peek().getInv().getCarteira().getLista().add("Vendeu: " + qtd + " pelo valor de: " + preco);
        ac.getOfertaCompra().peek().getInv().getCarteira().setSaldo(ac.getOfertaCompra().peek().getInv().getCarteira().getSaldo() - qtd * preco);
        ac.getOfertaCompra().peek().getInv().getCarteira().getHistorico().put(new Oferta(ac.getOfertaCompra().peek().getInv(), qtd, preco, ti), 3);
        ti.setQta(ti.getQta() + qtd);
        Ficheiro.getRepositorio().getAcao().get(ac.getOfertaCompra().peek().getAcao().getSigla()).setPreco(preco);
        ti.setPreco(valorTotal);
        ac.getValores().put(new MyDate(), preco);
        ac.getOfertaCompra().peek().getInv().getCarteira().setSaldoInvestido(ac.getOfertaCompra().peek().getInv().getCarteira().getSaldoInvestido() - preco * qtd);
        
        
        
        //TIRAR AO VENDEDOR
        ti2 = ac.getOfertaVenda().peek().getInv().getCarteira().getAcoes().get(ac.getOfertaVenda().peek().getAcao().getSigla());
        ti2.setQta(ti2.getQta() - qtd);
        ac.getOfertaVenda().peek().getInv().getCarteira().getHistorico().put(new Oferta(ac.getOfertaVenda().peek().getInv(), qtd, preco, ti), 4);
        ti2.setQtaInvestida(ti2.getQtaInvestida() - qtd);
        ac.getOfertaVenda().peek().getInv().getCarteira().setSaldo(ac.getOfertaVenda().peek().getInv().getCarteira().getSaldo() + qtd * preco);

    }

    private void executa(Acoes ac) {

        if (ac.getOfertaCompra().peek().getQuantidade() > ac.getOfertaVenda().peek().getQuantidade()) {
            distribui(ac, ac.getOfertaVenda().peek().getQuantidade(), ac.getOfertaCompra().peek().getPreco());
            ac.getOfertaCompra().peek().setQuantidade(ac.getOfertaCompra().peek().getQuantidade() - ac.getOfertaVenda().peek().getQuantidade());
            ac.getOfertaVenda().poll();

        } else if (ac.getOfertaCompra().peek().getQuantidade() < ac.getOfertaVenda().peek().getQuantidade()) {
            distribui(ac, ac.getOfertaCompra().peek().getQuantidade(), ac.getOfertaCompra().peek().getPreco());
            ac.getOfertaVenda().peek().setQuantidade(ac.getOfertaVenda().peek().getQuantidade() - ac.getOfertaCompra().peek().getQuantidade());
            ac.getOfertaCompra().poll();
        } else {
            distribui(ac, ac.getOfertaCompra().peek().getQuantidade(), ac.getOfertaCompra().peek().getPreco());
            ac.getOfertaCompra().poll();
            ac.getOfertaVenda().poll();
        }

        trigge(ac);
    }

    private void verifica(Acoes ac) {

        while (!ac.getOfertaCompra().isEmpty() && !ac.getOfertaVenda().isEmpty() && ac.getOfertaCompra().peek().getPreco() >= ac.getOfertaVenda().peek().getPreco()) {
            executa(ac);
        }

    }

    public Map<MyDate, Float> getValores() {
        return valores;
    }

    public void setValores(Map<MyDate, Float> valores) {
        this.valores = valores;
    }

    public void criarOfertaVenda(Investidor inv, int qtd, float precoMin, Acoes acao, boolean trigger, float precoTrigger, boolean ver) {
        if (trigger) {
            OfertaDeVenda ofv = new OfertaDeVenda(inv, qtd, precoMin, acao, precoTrigger);
            this.ofertaVendaTrigger.offer(ofv);

        } else {
            OfertaDeVenda ofv = new OfertaDeVenda(inv, qtd, precoMin, acao);
            this.ofertaVenda.offer(ofv);
        }
        if (ver) {
            this.verifica(acao);
        }
    }

    public void criarOfertaCompra(Investidor inv, int qtd, float precoMin, Acoes acao, boolean trigger, float precoTrigger, boolean ver) {
        if (trigger) {
            OfertaDeCompra ofc = new OfertaDeCompra(inv, qtd, precoMin, acao, precoTrigger);
            this.ofertaCompraTrigger.offer(ofc);
        } else {
            OfertaDeCompra ofc = new OfertaDeCompra(inv, qtd, precoMin, acao);
            this.ofertaCompra.offer(ofc);

        }
        if (ver) {
            System.out.println("fui ver");
            this.verifica(acao);
        }

    }

    public PriorityQueue<OfertaDeVenda> getOfertaVendaTrigger() {
        return ofertaVendaTrigger;
    }

    public void setOfertaVendaTrigger(PriorityQueue<OfertaDeVenda> ofertaVendaTrigger) {
        this.ofertaVendaTrigger = ofertaVendaTrigger;
    }

    public PriorityQueue<OfertaDeCompra> getOfertaCompraTrigger() {
        return ofertaCompraTrigger;
    }

    public void setOfertaCompraTrigger(PriorityQueue<OfertaDeCompra> ofertaCompraTrigger) {
        this.ofertaCompraTrigger = ofertaCompraTrigger;
    }

}
