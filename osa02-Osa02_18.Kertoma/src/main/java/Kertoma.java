
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int kertoma = 1;
        int kertoja = 1;
        
        System.out.print("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());
        
        while (luku > 0 && kertoja <= luku) {
            kertoma = kertoma * kertoja;
            kertoja++;
        }
        System.out.println("Kertoma on " + kertoma);

    }
}
