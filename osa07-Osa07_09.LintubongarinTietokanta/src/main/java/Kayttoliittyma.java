
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Kayttoliittyma {
    
    private Lintutietokanta tietokanta;
    private Scanner lukija;
    
    public Kayttoliittyma(Lintutietokanta tietokanta, Scanner lukija){
        this.tietokanta = tietokanta;
        this.lukija = lukija;
    }
    
    public void kaynnista(){
        while(true) {
            System.out.print("? ");
            String komento = lukija.nextLine();

            if (komento.equals("Lopeta") || komento.equals("lopeta")){
                break;
            } else if (komento.equals("Lisaa") || komento.equals("lisaa")){
                this.tietokanta.lisaaLintu();
            } else if (komento.equals("Havainto") || komento.equals("havainto")){
                this.tietokanta.lisaaHavainto();
            } else if (komento.equals("Tilasto") || komento.equals("tilasto")){
                this.tietokanta.tulostaTilasto();
            } else if (komento.equals("Nayta") || komento.equals("nayta")){
                this.tietokanta.naytaLintu();
            } else {
                System.out.println("En ymmärtänyt komentoa!");
            }
        }
    }
}
