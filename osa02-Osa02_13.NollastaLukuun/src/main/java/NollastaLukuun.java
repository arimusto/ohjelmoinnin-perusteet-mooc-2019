
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int tulosta = 0;
        int luku = Integer.valueOf(lukija.nextLine());
        
        while (tulosta <= luku) {
            System.out.println(tulosta);
            tulosta++;
        }

    }
}
