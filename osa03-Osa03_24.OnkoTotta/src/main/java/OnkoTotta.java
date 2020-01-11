
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        System.out.print("Kirjoita merkkijono: ");
        String mjono = lukija.nextLine();
        
        if (mjono.equals("totta")) {
            System.out.println("Oikein meni!");
        } else {
            System.out.println("Koitappa uudelleen!");
        }

    }
}
