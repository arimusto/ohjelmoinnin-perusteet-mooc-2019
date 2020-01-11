
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ari Mustonen
 */
public class Orkesteri {

    private ArrayList<Muusikko> muusikot;
    private int soittokerrat;

    public Orkesteri() {
        this.muusikot = new ArrayList<>();
        this.soittokerrat = 0;
    }

    public void lisaaMuusikko(Muusikko muusikko) {
        this.muusikot.add(muusikko);
    }

    public void soita() {
        this.soittokerrat++;

        for (Muusikko muusikko : this.muusikot) {
            muusikko.soita();
        }
    }

    @Override
    public String toString() {
        int jasentenSoittokerrat = 0;

        for (Muusikko muusikko : this.muusikot) {
            jasentenSoittokerrat += muusikko.kokemus();
        }

        double jasentenKeskiarvo = 1.0 * jasentenSoittokerrat / this.muusikot.size();

        String palautettava
                = "Orkesteri (soittokertoja "
                + this.soittokerrat
                + ", jäsenten kokemuksen keskiarvo: "
                + jasentenKeskiarvo + ")";

        for (Muusikko muusikko : this.muusikot) {
            palautettava += "\n" + muusikko;
        }

        return palautettava;
    }

}
