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
public class OfertaDeVenda extends Oferta implements Comparable, Serializable {

    public OfertaDeVenda(Investidor inv, int qtd, float precoMin, Acoes acao, float precoTrigger) {
        super(inv, qtd, precoMin, acao, precoTrigger);
    }

    public OfertaDeVenda(Investidor inv, int qtd, float precoMin, Acoes acao) {
        super(inv, qtd, precoMin, acao);
    }
    
    public OfertaDeVenda(Investidor inv, Warrants war, int qtd, float preco, Acoes ac) {
        super(inv, war, qtd, preco, ac);
    }
    
    public OfertaDeVenda(Investidor inv, Obrigações obg, int qtd, float preco){
        super(inv, obg, qtd, preco);
    }

    @Override
    public int compareTo(Object obj) {
        if (this.getPreco() < ((OfertaDeVenda) obj).getPreco()) {
            return -1;
        } else if (this.getPreco() == ((OfertaDeVenda) obj).getPreco()) {
            return 0;
        } else {
            return 1;
        }
    }

}
