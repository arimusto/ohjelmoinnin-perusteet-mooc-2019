
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.print("Nimi: ");
            String luettuNimi = lukija.nextLine();
            
            if (luettuNimi.equals("")) {
                break;
            }
            
            System.out.print("Sivuja: ");
            int luettuSivuja = Integer.valueOf(lukija.nextLine());
            
            System.out.print("Kirjoitusvuosi: ");
            int luettuVuosi = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(luettuNimi, luettuSivuja, luettuVuosi));
        }
        
        System.out.print("Mitä tulostetaan? ");
        String tulostettava = lukija.nextLine();
        
        if (tulostettava.equals("kaikki")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja);
            }
        }
        
        if (tulostettava.equals("nimi")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja.getNimi());
            }
        }

    }
}
