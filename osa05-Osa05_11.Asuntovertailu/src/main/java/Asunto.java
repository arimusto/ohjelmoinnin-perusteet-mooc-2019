
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        return false;
    }
    
    public int hintaero(Asunto verrattava) {
        int erotus = (this.nelioita * this.neliohinta) - (verrattava.nelioita * verrattava.neliohinta);
        if (erotus < 0) {
            erotus = erotus * -1;
        }
        return erotus;
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        if ((this.neliohinta * this.nelioita) > (verrattava.neliohinta * verrattava.nelioita)) {
            return true;
        }
        return false;
    }

}
