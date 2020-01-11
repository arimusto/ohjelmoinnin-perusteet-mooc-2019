
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int svuosiSumma = 0, svuosiMaara = 0;
        String pisinNimi = "";
        
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] rivi = luettu.split(",");
            
            if (pisinNimi.length() < rivi[0].length()) {
                pisinNimi = rivi[0];
            }
            
            svuosiSumma = svuosiSumma + Integer.valueOf(rivi[1]);
            svuosiMaara++;
        }
        
        System.out.println("Pisin nimi: " + pisinNimi);
        
        double svuosiKeskiarvo = 1.0 * svuosiSumma / svuosiMaara;
        System.out.println("Syntymävuosien keskiarvo: " + svuosiKeskiarvo);

    }
}
