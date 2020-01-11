
import java.util.ArrayList;
import java.util.HashMap;

public class KonekoeTehtava2 {

    public static void main(String[] args) {

    }

    public static void tilastoja(ArrayList<Integer> luvut) {

        if (luvut.isEmpty()) {
            System.out.println("Listalla ei ole lukuja.");

        } else {
            int pienin = luvut.get(0);
            int suurin = luvut.get(0);
            int summa = 0;

            for (int luku : luvut) {
                if (luku < pienin) {
                    pienin = luku;
                }

                if (luku > suurin) {
                    suurin = luku;
                }

                summa += luku;
            }

            System.out.println("pienin: " + pienin);
            System.out.println("suurin: " + suurin);
            System.out.println("summa: " + summa);
        }
    }

    public static void poistaOsa(ArrayList<Integer> luvut) {

        for (int luku : new ArrayList<>(luvut)) {
            if (luku != 0 && (luku % 3 == 0 || luku % 7 == 0)) {
                luvut.remove(Integer.valueOf(luku));
            }
        }
    }

    public static HashMap<String, String> kaanna(HashMap<String, String> parit) {

        HashMap<String, String> palautettava = new HashMap<>();

        for (String avain : parit.keySet()) {
            palautettava.put(parit.get(avain), avain);
        }

        return palautettava;
    }
}
