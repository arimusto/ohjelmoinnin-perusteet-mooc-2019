
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
public class Ajoneuvorekisteri {
    
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if(this.omistajat.get(rekkari) == null) {
            this.omistajat.put(rekkari, omistaja);
            return true;
        }
        return false;
    }
    
    public String hae(Rekisterinumero rekkari) {
        return this.omistajat.get(rekkari);
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if(this.omistajat.get(rekkari) != null) {
            this.omistajat.remove(rekkari);
            return true;
        }
        return false;
    }
    
    public void tulostaRekisterinumerot() {
        for(Rekisterinumero rekNro: this.omistajat.keySet()) {
            System.out.println(rekNro);
        }
    }
    
    public void tulostaOmistajat() {
        ArrayList<String> eriOmistajat = new ArrayList<>();
        for(Rekisterinumero rekNro: this.omistajat.keySet()) {
            if(eriOmistajat.contains(this.omistajat.get(rekNro))) {
                continue;
            } else {
                System.out.println(this.omistajat.get(rekNro));
                eriOmistajat.add(this.omistajat.get(rekNro));
            }
        }
    }
        
}
