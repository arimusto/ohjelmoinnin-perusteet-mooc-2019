/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ari Mustonen
 */
public class Kuutio {
    private int sarmanPituus;
    private int tilavuus;
    
    public Kuutio(int sarmanPituus) {
        this.sarmanPituus = sarmanPituus;
        this.tilavuus = this.sarmanPituus * this.sarmanPituus * this.sarmanPituus;
    }
    
    public int tilavuus() {
        return this.tilavuus;
    }
    
    public String toString() {
        return "Kuution särmän pituus on " + this.sarmanPituus + ", tilavuus on " + this.tilavuus;
    }
}
