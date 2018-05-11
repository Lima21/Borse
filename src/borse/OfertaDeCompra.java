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
public class OfertaDeCompra extends Oferta implements Comparable, Serializable {
   
    

    
    public OfertaDeCompra(Investidor inv, int qtd, float precoMin, Acoes acao, float precoTrigger) {
        super(inv, qtd, precoMin, acao, precoTrigger);
    }
    
    public OfertaDeCompra(Investidor inv, int qtd, float precoMin, Acoes acao) {
        super(inv, qtd, precoMin, acao);
    }
    
    
    
    @Override
    public int compareTo(Object obj) {
        if (this.getPreco() > ((OfertaDeCompra) obj).getPreco())
            return -1;
        else if (this.getPreco() == ((OfertaDeCompra) obj).getPreco())
            return 0;
        else
            return 1;
    }
    



}
