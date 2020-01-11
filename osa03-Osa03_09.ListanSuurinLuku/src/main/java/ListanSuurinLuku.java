
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");

        // toteuta listan suurimman luvun selvittäminen tänne
        int suurin = lista.get(0);
        
        int indeksi = 1;
        while (indeksi < lista.size()) {
            if (lista.get(indeksi) > suurin) {
                suurin = lista.get(indeksi);
            }
            indeksi++;
        }
        
        System.out.println("Listan suurin luku: " + suurin);
    }
}
