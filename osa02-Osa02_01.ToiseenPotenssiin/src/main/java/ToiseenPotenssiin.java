
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int luku, vastaus;
        luku = Integer.valueOf(lukija.nextLine());
        vastaus = luku * luku;
        System.out.println(vastaus);

    }
}
