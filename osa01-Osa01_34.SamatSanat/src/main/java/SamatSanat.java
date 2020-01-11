
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        String mjono1, mjono2;
        System.out.println("Syötä ensimmäinen merkkijono:");
        mjono1 = lukija.nextLine();
        System.out.println("Syötä toinen merkkijono");
        mjono2 = lukija.nextLine();
        if (mjono1.equals(mjono2)) {
            System.out.println("Samat sanat");
        } else {
            System.out.println("Ei sitten");
        }
    }
}
