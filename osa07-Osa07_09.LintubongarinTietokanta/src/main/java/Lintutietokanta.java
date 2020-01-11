
import java.util.HashMap;
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
public class Lintutietokanta {
    
    private HashMap<String, Lintu> lintutietokanta;
    private Scanner lukija;
    
    public Lintutietokanta(Scanner lukija){
        this.lintutietokanta = new HashMap<>();
        this.lukija = lukija;
    }
    
    public void lisaaLintu(){

        System.out.print("Nimi: ");
        String luettuNimi = lukija.nextLine();
        
        if(!this.lintutietokanta.containsKey(luettuNimi)) {
            System.out.print("Latinankielinen nimi: ");
            String luettuLatinaksi = lukija.nextLine();
            this.lintutietokanta.put(luettuNimi, new Lintu(luettuNimi, luettuLatinaksi));
        } else {
            System.out.println(luettuNimi + " on jo tietokannassa!");
        }
    }
    
    public void lisaaHavainto(){
        System.out.print("Mikä havaittu? ");
        String havaittu = lukija.nextLine();
        
        if(this.lintutietokanta.containsKey(havaittu)) {
            this.lintutietokanta.get(havaittu).lisaaHavainto();
        } else {
            System.out.println("Ei ole lintu!");
        }
    }
    
    public void tulostaTilasto(){
        for(String lintu: this.lintutietokanta.keySet()){
            System.out.println(this.lintutietokanta.get(lintu));
        }
    }
    
    public void naytaLintu(){
        System.out.print("Mikä? ");
        String haettava = lukija.nextLine();
        
        if(this.lintutietokanta.containsKey(haettava)) {
            System.out.println(this.lintutietokanta.get(haettava));
        } else {
            System.out.println("En löydä tietokannasta lintua '" + haettava + "'.");
        }
    }
}
