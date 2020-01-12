
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String mjono = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int kluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double lluku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean totuus = Boolean.valueOf(lukija.nextLine());
        System.out.println("Syötit merkkijonon " + mjono);
        System.out.println("Syötit kokonaisluvun " + kluku);
        System.out.println("Syötit liukuluvun " + lluku);
        System.out.println("Syötit totuusarvon " + totuus);
    }
}
