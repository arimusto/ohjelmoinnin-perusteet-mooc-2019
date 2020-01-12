
import java.util.Scanner;

public class Yhteenlasku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        int luku1, luku2;
        System.out.println("Syötä ensimmäinen luku!");
        luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        luku2 = Integer.valueOf(lukija.nextLine());
        System.out.println(luku1 + " + " + luku2 + " = " + (luku1 + luku2));
    }
}
