/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.PriorityQueue;

/**
 *
 * @author admin
 */
public abstract class Titulo implements Serializable {
    private String Sigla;
    private String Nome;
    private float Preco;
    private int Qta;
    private int QtaInvestida;
    protected PriorityQueue<OfertaDeVenda> ofertaVenda;
    protected PriorityQueue<OfertaDeCompra> ofertaCompra;
    
    public Titulo() {
        ofertaVenda = new PriorityQueue<>();
        ofertaCompra = new PriorityQueue<>();
    }
    
    public PriorityQueue<OfertaDeVenda> getOfertaVenda() {
        return ofertaVenda;
    }

    public void setOfertaVenda(PriorityQueue<OfertaDeVenda> ofertaVenda) {
        this.ofertaVenda = ofertaVenda;
    }

    public PriorityQueue<OfertaDeCompra> getOfertaCompra() {
        return ofertaCompra;
    }

    public void setOfertaCompra(PriorityQueue<OfertaDeCompra> ofertaCompra) {
        this.ofertaCompra = ofertaCompra;
    }
    
    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public int getQta() {
        return Qta;
    }

    public void setQta(int Qta) {
        this.Qta = Qta;
    }

    public int getQtaInvestida() {
        return QtaInvestida;
    }

    public void setQtaInvestida(int QtaInvestida) {
        this.QtaInvestida = QtaInvestida;
    }
    
    
}
