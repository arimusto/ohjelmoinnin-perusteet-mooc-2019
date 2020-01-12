
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int summa = 0;
        int lukuja = 0;
        double keskiarvo;
        int parilliset = 0;
        int parittomat = 0;
        
        System.out.println("Syötä luvut:");
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            }
            summa = summa + luku;
            if (luku % 2 == 0) {
                parilliset++;
            } else {
                parittomat++;
            }
            lukuja++;
        }
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        keskiarvo = 1.0 * summa / lukuja;
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parilliset);
        System.out.println("Parittomia: " + parittomat);

    }
}
