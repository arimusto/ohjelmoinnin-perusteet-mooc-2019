
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ari
 */
public class Sanakirja {
    
    private HashMap<String, String> sanakirja;
    
    public Sanakirja() {
        this.sanakirja = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos) {
        this.sanakirja.put(sana, kaannos);
    }
    
    public String kaanna(String sana) {
        return this.sanakirja.get(sana);
    }
    
    public int sanojenLukumaara() {
        return this.sanakirja.size();
    }
    
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> palautettava = new ArrayList<>();
        for(String sana: this.sanakirja.keySet()) {
            palautettava.add(sana + " = " + this.sanakirja.get(sana));
        }
        return palautettava;
    }
}
