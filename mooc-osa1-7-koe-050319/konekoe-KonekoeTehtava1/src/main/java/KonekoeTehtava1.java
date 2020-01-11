
import java.util.Scanner;

public class KonekoeTehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String lyhinSana = "";
        String pisinSana = "";
        int merkkeja = 0;
        int sanoja = 0;

        while (true) {

            String mjono = lukija.nextLine();

            if (mjono.equals("loppu")) {
                break;
            }

            if (sanoja == 0) {
                lyhinSana = mjono;
                pisinSana = mjono;
            }

            if (mjono.length() < lyhinSana.length()) {
                lyhinSana = mjono;
            }

            if (mjono.length() > pisinSana.length()) {
                pisinSana = mjono;
            }

            sanoja++;
            merkkeja += mjono.length();
        }

        System.out.println("");

        if (sanoja > 0) {
            System.out.println("lyhin: " + lyhinSana);
            System.out.println("pisin: " + pisinSana);
            System.out.println("keskipituus: " + 1.0 * merkkeja / sanoja);

        } else {
            System.out.println("Ei merkkijonoja.");
        }
    }
}
