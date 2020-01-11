
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Kellari {
    
    private HashMap<String, ArrayList<String>> kellari;
    
    public Kellari() {
        this.kellari = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara) {
        this.kellari.putIfAbsent(komero, new ArrayList<>());
        this.kellari.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero) {
        if (this.kellari.get(komero) != null) {
            return this.kellari.get(komero);
        }
        return new ArrayList<>();
    }
    
    public void poista(String komero, String tavara) {
        this.kellari.get(komero).remove(tavara);
        if (this.kellari.get(komero).isEmpty()) {
            this.kellari.remove(komero);
        }
    }
    
    public ArrayList<String> komerot() {
        ArrayList<String> komerot = new ArrayList<>();
        for(String komero: this.kellari.keySet()) {
            if(!this.kellari.get(komero).isEmpty()) {
                komerot.add(komero);
            }
        }
        return komerot;
    }
    
}
