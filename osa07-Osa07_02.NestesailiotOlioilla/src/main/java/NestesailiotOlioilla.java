
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio ensimmainenSailio = new Sailio();
        Sailio toinenSailio = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainenSailio);
            System.out.println("Toinen: " + toinenSailio);
            System.out.print("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);
            
            if (komento.equals("lisaa")) {
                ensimmainenSailio.lisaa(maara);
            }
            
            if (komento.equals("siirra")) {
                if (maara > ensimmainenSailio.sisalto()) {
                    maara = ensimmainenSailio.sisalto();
                }
                
                ensimmainenSailio.poista(maara);
                toinenSailio.lisaa(maara);
            }
            
            if (komento.equals("poista")) {
                toinenSailio.poista(maara);
            }
            
            System.out.println("");

        }
    }

}
