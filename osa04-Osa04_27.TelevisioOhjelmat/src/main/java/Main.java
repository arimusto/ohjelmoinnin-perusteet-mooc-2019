
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        while (true) {
            System.out.print("Nimi: ");
            String kysyttyNimi = lukija.nextLine();
            
            if (kysyttyNimi.equals("")) {
                break;
            }
            
            System.out.print("Pituus: ");
            int kysyttyPituus = Integer.valueOf(lukija.nextLine());
            
            ohjelmat.add(new TelevisioOhjelma(kysyttyNimi, kysyttyPituus));
        }
        
        System.out.print("Ohjelman maksimipituus? ");
        int maksimipituus = Integer.valueOf(lukija.nextLine());
        
        for (TelevisioOhjelma ohjelma: ohjelmat) {
            if (ohjelma.getPituus() <= maksimipituus) {
                System.out.println(ohjelma);
            }
        }

    }
}
