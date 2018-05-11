/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Oferta implements Serializable {
    
    private int quantidade;
    private float preco;
    private float precoTrigger;
    private Date data;
    private Investidor inv;
    private Acoes acao;
    private Warrants warrant;
    private MyDate data2;
    private Obrigações obrigação;
    
    public Oferta(Investidor inv, int qtd, float precoMin, Acoes acao, float precoTrigger) {
        this.setInv(inv);
        this.setQuantidade(qtd);
        this.setPreco(precoMin);
        this.setAcao(acao);
        this.setPrecoTrigger(precoTrigger);
        this.setData(new Date());
    }
    
    public Oferta(Investidor inv, Warrants ti, int qtd, float valor, Acoes ac) {
        this.setInv(inv);
        this.setQuantidade(qtd);
        this.setPreco(valor);
        this.setWarrant(ti);
        this.setAcao(ac);
    }
    
    public Oferta(Investidor inv, Obrigações obg, int qtd, float valor){
        this.setInv(inv);
        this.setQuantidade(qtd);
        this.setPreco(valor);
        this.setObrigação(obg);
    }

    public Obrigações getObrigação() {
        return obrigação;
    }

    public void setObrigação(Obrigações obrigação) {
        this.obrigação = obrigação;
    }

    
   
    
    
    public Oferta() {
        
    }

    public Warrants getWarrant() {
        return warrant;
    }

    public void setWarrant(Warrants warrant) {
        this.warrant = warrant;
    }

    
    public MyDate getData2() {
        return data2;
    }

    public void setData2(MyDate data2) {
        this.data2 = data2;
    }
    
    
    public Oferta(Investidor inv, int qtd, float precoMin, Acoes acao) {
        this.setInv(inv);
        this.setQuantidade(qtd);
        this.setPreco(precoMin);
        this.setAcao(acao);
        this.setData(new Date());
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Investidor getInv() {
        return inv;
    }

    public void setInv(Investidor inv) {
        this.inv = inv;
    }

    public float getPrecoTrigger() {
        return precoTrigger;
    }

    public void setPrecoTrigger(float precoTrigger) {
        this.precoTrigger = precoTrigger;
    }

    public Acoes getAcao() {
        return acao;
    }

    public void setAcao(Acoes acao) {
        this.acao = acao;
    }
    
    
    
    
    

    
    
    
}
