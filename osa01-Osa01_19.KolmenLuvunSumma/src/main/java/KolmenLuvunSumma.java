
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        int summa;
        System.out.println("Syötä ensimmäinen luku!");
        summa = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        summa = summa + Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        summa = summa + Integer.valueOf(lukija.nextLine());
        System.out.println("Lukujen summa on " + summa);
    }
}
