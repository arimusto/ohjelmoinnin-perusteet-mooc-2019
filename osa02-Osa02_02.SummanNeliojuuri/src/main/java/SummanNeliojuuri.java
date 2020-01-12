
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int luku1, luku2;
        double njuuri;
        luku1 = Integer.valueOf(lukija.nextLine());
        luku2 = Integer.valueOf(lukija.nextLine());
        njuuri = Math.sqrt(luku1 + luku2);
        System.out.println(njuuri);

    }
}
