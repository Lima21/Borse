/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */

/**
 * 
 * 1 - Enviar Compra
 * 2 - Enviar Venda
 * 3 - Efetuar Compra
 * 4 - Efetuar Venda
 * 5 - Cancelamento de Compra
 * 6 - Cancelamento de Venda 
 */
public class Carteira implements Serializable {
   
   private Map<Oferta, Integer> historico;
   private float saldo;
   private float saldoInvestido;
   private Map<String, Acoes> acoes;
   private Map<String, Warrants> LW;
   private Map<String, Obrigações> obg;
   private List<String> lista;
   
   public Carteira() {
       historico = new LinkedHashMap<>();
       acoes = new HashMap<>();
       LW = new HashMap<>();
       obg = new HashMap<>();
       lista = new ArrayList<>();
   }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
   
   

    public Map<String, Warrants> getLW() {
        return LW;
    }

    public void setLW(Map<String, Warrants> LW) {
        this.LW = LW;
    }

    public Map<String, Obrigações> getObg() {
        return obg;
    }

    public void setObg(Map<String, Obrigações> obg) {
        this.obg = obg;
    }

    public Map<Oferta, Integer> getHistorico() {
        return historico;
    }

    public void setHistorico(Map<Oferta, Integer> historico) {
        this.historico = historico;
    }

    public Map<String, Acoes> getAcoes() {
        return acoes;
    }

    public void setAcoes(Map<String, Acoes> acoes) {
        this.acoes = acoes;
    }

    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    

    public float getSaldoInvestido() {
        return saldoInvestido;
    }

    public void setSaldoInvestido(float saldoInvestido) {
        this.saldoInvestido = saldoInvestido;
    }
   
   
}
