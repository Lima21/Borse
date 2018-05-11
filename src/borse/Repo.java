/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Repo implements Serializable{

    
    private Map<String, Investidor> inv;
    private Map<String, Acoes> acao;
    private Map<String, Warrants> warrants;
    private Map<String, Obrigações> obrigações;
    

    
    public Repo() {
        acao = new HashMap<>();
        inv = new HashMap<>();
        warrants = new HashMap<>();
        obrigações = new HashMap<>();
    }

    public Map<String, Obrigações> getObrigações() {
        return obrigações;
    }

    public void setObrigações(Map<String, Obrigações> obrigações) {
        this.obrigações = obrigações;
    }
    
    

    public Map<String, Warrants> getWarrants() {
        return warrants;
    }

    public void setWarrants(Map<String, Warrants> warrants) {
        this.warrants = warrants;
    }
    
    

    public Map<String, Investidor> getInv() {
        return inv;
    }

    public void setInv(Map<String, Investidor> inv) {
        this.inv = inv;
    }
    
 
    public Map<String, Acoes> getAcao() {
        return acao;
    }

    public void setAcao(Map<String, Acoes> acao) {
        this.acao = acao;
    }


    
    
    
    


    
  
}
