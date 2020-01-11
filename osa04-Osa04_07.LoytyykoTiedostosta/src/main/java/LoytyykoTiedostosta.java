
import java.io.File;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        boolean nimiLoytyy = false, tiedostoLoytyy = true;
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String luettuRivi = tiedostonLukija.nextLine();
                if (luettuRivi.equals(etsittava)) {
                    nimiLoytyy = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
            tiedostoLoytyy = false;
        }
        
        if (nimiLoytyy && tiedostoLoytyy) {
            System.out.println("Löytyi!");
        } else if (tiedostoLoytyy) {
            System.out.println("Ei löytynyt.");
        }

    }
}
