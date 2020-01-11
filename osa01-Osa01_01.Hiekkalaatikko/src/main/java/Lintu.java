/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Lintu extends Elain {

    private int siipivali;

    public Lintu(String nimi, int siipivali) {
        super(nimi);
        this.siipivali = siipivali;
    }

    public void lenna() {
        String test = "kakka";
        int matka = (super.toString().hashCode() * test.hashCode()) % this.siipivali;
        System.out.println(toString() + " lentää " + matka + " metriä.");
    }
}
