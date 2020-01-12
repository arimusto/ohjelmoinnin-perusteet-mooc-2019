
import java.util.Scanner;

public class MontaTulostusta {

    public static void main(String[] args) {
        // kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka monta?");
        int monta = Integer.valueOf(lukija.nextLine());
        
        int tulosta = 1;
        while (tulosta <= monta && monta > 0) {
            tulostaTeksti();
            tulosta++;
        }
    }
    
    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");
    }
}
