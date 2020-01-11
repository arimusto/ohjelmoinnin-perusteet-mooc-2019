
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        int luku;
        System.out.println("Anna luku:");
        luku = Integer.valueOf(lukija.nextLine());
        if (luku == 1984) {
            System.out.println("Orwell");
        }
    }
}
