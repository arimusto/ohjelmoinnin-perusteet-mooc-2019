
import java.util.ArrayList;
import java.util.HashMap;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private ArrayList<Integer> lista;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.lista = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
        
        this.lista.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }


    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public double koepisteidenKeskiarvo() {
        int summa = 0;
        for(int arvosana: this.lista) {
            summa += arvosana;
        }
        return 1.0 * summa / this.lista.size();
    }
    
    public double arvosanojenKeskiarvo() {
        int summa = 0;
        int lukumaara = 0;
        for(int i = 0; i <= 5; i++) {
            summa = summa + this.montakoSaanutArvosanan(i) * i;
            lukumaara += this.montakoSaanutArvosanan(i);
        }
        return 1.0 * summa / lukumaara;
    }
}
