
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String nuorinNimi = "";
        int nuorinIka = 200;
        
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }
            String[] osat = rivi.split(",");
            int luettuIka = Integer.valueOf(osat[1]);
            if (luettuIka < nuorinIka) {
                nuorinNimi = osat[0];
                nuorinIka = luettuIka;
            }
        }
        
        System.out.println("Nuorin oli: " + nuorinNimi);

    }
}
