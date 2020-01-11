
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        // Luetaan arvot listamuuttujaan luvut
        ArrayList<Integer> luvut = new ArrayList<>();
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 9999) {
                break;
            }
            luvut.add(luku);
        }
        
        // Selvitetään pienin luku
        int pienin = luvut.get(0);
        int indeksi = 1;
        
        while (indeksi < luvut.size()) {
            if (luvut.get(indeksi) < pienin) {
                pienin = luvut.get(indeksi);
            }
            indeksi++;
        }
        
        // Tulostetaan pienin luku
        System.out.println("Pienin luku on " + pienin);
        
        // Tulostetaan indeksit, joista pienin luku löytyy
        indeksi = 0;
        while (indeksi < luvut.size()) {
            if (luvut.get(indeksi) == pienin) {
                System.out.println("Pienin luku löytyy indeksistä " + indeksi);
            }
            indeksi++;
        }
    }
}
