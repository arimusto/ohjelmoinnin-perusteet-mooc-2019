
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        //oma koodi
        int luku1, luku2;
        luku1 = Integer.valueOf(lukija.nextLine());
        luku2 = Integer.valueOf(lukija.nextLine());
        
        if (luku1 > luku2) {
            System.out.println("Luku " + luku1 + " on suurempi kuin luku " + luku2 + ".");
        } else if (luku1 < luku2) {
            System.out.println("Luku " + luku1 + " on pienempi kuin luku " + luku2 + ".");
        } else {
            System.out.println("Luku " + luku1 + " on yhtä suuri kuin luku " + luku2 + ".");
        }

    }
}
