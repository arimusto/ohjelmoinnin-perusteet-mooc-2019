
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
public class Lastiruuma {
    
    private int maksimipaino;
    private ArrayList<Matkalaukku> matkalaukut;
    
    public Lastiruuma(int maksimipaino){
        this.maksimipaino = maksimipaino;
        this.matkalaukut = new ArrayList<>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku){
        if (this.yhteispaino() + laukku.yhteispaino() <= this.maksimipaino){
            this.matkalaukut.add(laukku);
        }
    }
    
    public int yhteispaino(){
        int paino = 0;
        
        for (Matkalaukku matkalaukku: this.matkalaukut){
            paino += matkalaukku.yhteispaino();
        }

        return paino;
    }
    
    public void tulostaTavarat(){
        for (Matkalaukku matkalaukku: this.matkalaukut){
            matkalaukku.tulostaTavarat();
        }
    }
    
    @Override
    public String toString(){
        int laukkuja = this.matkalaukut.size();
        return laukkuja + " matkalaukkua (" + this.yhteispaino() + " kg)";
    }
}
