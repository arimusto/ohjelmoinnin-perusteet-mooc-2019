
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
public class Resepti {
    
    private String nimi;
    private int keittoaika;
    private ArrayList<String> aineet;
    
    public Resepti(String nimi, int keittoaika, ArrayList<String> aineet){
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.aineet = (ArrayList) aineet.clone();
    }
    
    public int getKeittoaika(){
        return this.keittoaika;
    }
    
    public ArrayList<String> getRaakaAineet(){
        return this.aineet;
    }
    
    @Override
    public String toString(){
        return this.nimi + ", keittoaika: " + this.keittoaika;
    }
    
}
