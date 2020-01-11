
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        
        Lukutilasto kaikki = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();
        
        System.out.println("Anna lukuja:");
        while (true) {
            int luettuLuku = Integer.valueOf(lukija.nextLine());
            
            if (luettuLuku == -1) {
                break;
            }
            
            kaikki.lisaaLuku(luettuLuku);
            
            if (luettuLuku % 2 == 0) {
                parilliset.lisaaLuku(luettuLuku);
            } else {
                parittomat.lisaaLuku(luettuLuku);
            }
        }
        
        System.out.println("Summa: " + kaikki.summa());
        System.out.println("Parillisten summa: " + parilliset.summa());
        System.out.println("Parittomien summa: " + parittomat.summa());
    }
}
