/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Muusikko {

    private String nimi;
    private String soitin;
    private int kokemus;

    public Muusikko(String nimi, String soitin) {
        this.nimi = nimi;
        this.soitin = soitin;
        this.kokemus = 0;
    }

    public int kokemus() {
        return this.kokemus;
    }

    public void soita() {
        this.kokemus++;
    }

    @Override
    public String toString() {
        return this.nimi + ", soitin: " + this.soitin + ". Kokemus: " + this.kokemus;
    }

}
