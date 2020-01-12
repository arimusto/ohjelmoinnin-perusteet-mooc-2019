
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        int luku1, luku2, luku3;
        System.out.println("Syötä ensimmäinen luku!");
        luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        luku2 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        luku3 = Integer.valueOf(lukija.nextLine());
        double keskiarvo = (double) (luku1 + luku2 + luku3) / 3;
        System.out.println("Syötettyjen lukujen keskiarvo on " + keskiarvo);
    }
}