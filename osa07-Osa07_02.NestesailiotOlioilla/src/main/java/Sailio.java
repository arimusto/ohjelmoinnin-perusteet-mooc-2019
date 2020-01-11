/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Sailio {
    
    private int maara;
    
    public Sailio() {
        this.maara = 0;
    }
    
    public int sisalto() {
        return this.maara;
    }
    
    public void lisaa(int maara) {
        if (maara < 0) {
            maara = 0;
        }
        
        this.maara += maara;
        
        if (this.maara > 100) {
            this.maara = 100;
        }
    }
    
    public void poista(int maara) {
        if (maara < 0) {
            maara = 0;
        }
        
        this.maara -= maara;
        
        if (this.maara < 0) {
            this.maara = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.maara + "/100";
    }
}
