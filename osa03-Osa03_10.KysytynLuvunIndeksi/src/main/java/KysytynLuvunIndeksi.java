
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

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

        // toteuta tänne toiminnallisuus luvun etsimiseen
        System.out.print("Mitä etsitään? ");
        int etsittava = Integer.valueOf(lukija.nextLine());
        
        int luettavaIndeksi = 0;
        int viimeinenIndeksi = lista.size() - 1;
        
        while (luettavaIndeksi <= viimeinenIndeksi) {
            if (lista.get(luettavaIndeksi) == etsittava) {
                System.out.println("Luku " + etsittava + " on indeksissä " + luettavaIndeksi);
            }
            luettavaIndeksi++;
        }
    }
}
