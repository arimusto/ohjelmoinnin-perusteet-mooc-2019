/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Kirja {
    private String nimi;
    private int sivumaara;
    private int kirjoitusvuosi;
    
    public Kirja(String nimi, int sivumaara, int kirjoitusvuosi) {
        this.nimi = nimi;
        this.sivumaara = sivumaara;
        this.kirjoitusvuosi = kirjoitusvuosi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return this.nimi + ", " + this.sivumaara + " sivua, " + this.kirjoitusvuosi;
    }
}
