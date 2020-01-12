
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // oma koodi
        System.out.print("Mihin asti? ");
        int mihin = Integer.valueOf(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int mista = Integer.valueOf(lukija.nextLine());
        
        while (mista <= mihin) {
            System.out.println(mista);
            mista++;
        }
    }
}
