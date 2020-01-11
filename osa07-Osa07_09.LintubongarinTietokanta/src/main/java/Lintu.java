/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Lintu {
    
    private String nimi;
    private String latinaksi;
    private int havainnot;
    
    public Lintu(String nimi, String latinaksi){
        this.nimi = nimi;
        this.latinaksi = latinaksi;
        this.havainnot = 0;
    }
    
    public void lisaaHavainto(){
        this.havainnot++;
    }
    
    @Override
    public String toString(){
        return this.nimi + "(" + latinaksi + "): " + havainnot + " havaintoa";
    }
}
