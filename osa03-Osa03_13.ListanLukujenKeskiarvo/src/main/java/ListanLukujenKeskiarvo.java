
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
        
        // Luetaan luvut listalle
        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                System.out.println("");
                break;
            }
            luvut.add(luku);
        }
        
        // Lasketaan listan lukujen summa
        int summa = 0;
        for (Integer luettu: luvut) {
            summa = summa + luettu;
        }
        
        // lasketaan keskiarvo ja tulostetaan
        double keskiarvo = 1.0 * summa / luvut.size();
        System.out.println("Keskiarvo: " + keskiarvo);
    }
}
