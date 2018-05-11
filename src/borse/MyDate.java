/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author admin
 */
public class MyDate implements Serializable {
    private Calendar cal;
    private int ano;
    private int mes;
    private int dia;
    
    public MyDate() {
        cal = Calendar.getInstance();
        ano = cal.get(Calendar.YEAR);
        mes = cal.get(Calendar.MONTH);
        mes += 1;
        dia = cal.get(Calendar.DATE);

    }
    
    public MyDate(int ano, int mes, int dia) {
        
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    
    }
    
    public boolean after(MyDate data) {
        if(this.ano > data.ano)
            return true;
        else if(this.ano < data.ano)
            return false;
        else if(this.mes > data.mes)
            return true;
        else if(this.mes < data.mes)
            return false;
        else if(this.dia > data.dia)
            return true;
        else
            return false;
    }
    
    public boolean equals(MyDate data) {
        if(this.ano == data.ano && this.mes == data.mes && this.dia == data.dia)
            return true;
        else
            return false;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public String getData() {
        return dia + "/" + mes + "/" + ano;
    }
    
}
