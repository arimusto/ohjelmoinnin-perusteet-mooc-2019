
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int vanhinIka = -1;
        String vanhinNimi = "";
        
        System.out.println("Mikä tiedosto luetaan?");
        String tiedostonNimi = lukija.nextLine();
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedostonNimi))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(",");
                int luettuIka = Integer.valueOf(osat[1]);
                if (luettuIka > vanhinIka) {
                    vanhinNimi = osat[0];
                    vanhinIka = luettuIka;
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        System.out.println("Vanhin oli: " + vanhinNimi);

    }
}
