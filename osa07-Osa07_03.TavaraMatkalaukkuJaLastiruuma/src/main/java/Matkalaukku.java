
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
public class Matkalaukku {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }

    public void lisaaTavara(Tavara tavara) {
        if (this.yhteispaino() + tavara.getPaino() <= this.maksimipaino) {
            this.tavarat.add(tavara);
        }
    }

    public int yhteispaino() {
        int paino = 0;

        for (Tavara tavara : this.tavarat) {
            paino += tavara.getPaino();
        }

        return paino;
    }

    public void tulostaTavarat() {
        for (Tavara tavara : this.tavarat) {
            System.out.println(tavara);
        }
    }
    
    public Tavara raskainTavara(){
        Tavara raskain = new Tavara("raskain", 0);
        
        for (Tavara tavara: this.tavarat){
            if (tavara.getPaino() >= raskain.getPaino()) {
                raskain = tavara;
            }
        }
        
        if (this.tavarat.isEmpty()){
            return null;
        } else {
            return raskain;
        }
    }

    @Override
    public String toString() {
        int tavaroita = this.tavarat.size();
        if (tavaroita == 0) {
            return "ei tavaroita (0 kg)";
        } else if (tavaroita == 1) {
            return "1 tavara (" + this.yhteispaino() + " kg)";
        } else {
            return tavaroita + " tavaraa (" + this.yhteispaino() + " kg)";
        }
    }
}
