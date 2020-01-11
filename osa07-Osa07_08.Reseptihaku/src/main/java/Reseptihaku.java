
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Keittokirja keittokirja = new Keittokirja();

        System.out.print("Mistä luetaan? ");
        String tiedosto = lukija.nextLine();

        keittokirja.lueReseptitTiedostosta(tiedosto);

        System.out.println("\n"
                + "Komennot:\n"
                + "listaa - listaa reseptit\n"
                + "lopeta - lopettaa ohjelman\n"
                + "hae nimi - hakee reseptiä nimen perusteella\n"
                + "hae keittoaika - hakee reseptiä keittoajan perusteella\n"
                + "hae aine - hakee reseptiä raaka-aineen perusteella");
        
        while (true){
            System.out.print("\nSyötä komento: ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")){
                break;

            } else if (komento.equals("listaa")){
                keittokirja.listaaReseptit();

            } else if (komento.equals("hae nimi")){
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                keittokirja.haeReseptiaNimella(haettava);

            } else if (komento.equals("hae keittoaika")){
                System.out.print("Keittoaika korkeintaan: ");
                int keittoaika = Integer.valueOf(lukija.nextLine());
                keittokirja.haeReseptiaKeittoajalla(keittoaika);

            } else if (komento.equals("hae aine")){
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String aine = lukija.nextLine();
                keittokirja.haeReseptiaAineella(aine);

            } else {
                System.out.println("En ymmärtänyt komentoa!");
            }
        }
    }
}
