
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        int nopeus;
        System.out.println("Kerro nopeus:");
        nopeus = Integer.valueOf(lukija.nextLine());
        if (nopeus > 120) {
            System.out.println("Ylinopeussakko!");
        }
    }
}
