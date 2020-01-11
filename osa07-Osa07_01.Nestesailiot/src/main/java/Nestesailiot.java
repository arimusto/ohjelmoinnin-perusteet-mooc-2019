
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ensimmainenSailio = 0;
        int toinenSailio = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainenSailio + "/100");
            System.out.println("Toinen: " + toinenSailio + "/100");

            System.out.print("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);
            
            if (komento.equals("lisaa")) {
                if (maara > 0) {
                    ensimmainenSailio += maara;
                }
                
                if (ensimmainenSailio > 100) {
                    ensimmainenSailio = 100;
                }
            }
            
            if (komento.equals("siirra")) {
                if (maara > 0) {
                    if (maara > ensimmainenSailio) {
                        maara = ensimmainenSailio;
                    }
                    ensimmainenSailio -= maara;
                    toinenSailio += maara;
                }
                
                if (toinenSailio > 100) {
                    toinenSailio = 100;
                }
            }
            
            if (komento.equals("poista")) {
                if (maara < 0) {
                    maara = 0;
                }
                
                if (maara > toinenSailio) {
                    maara = toinenSailio;
                }
                
                toinenSailio -= maara;
            }
            
            System.out.println("");
        }
    }
}
