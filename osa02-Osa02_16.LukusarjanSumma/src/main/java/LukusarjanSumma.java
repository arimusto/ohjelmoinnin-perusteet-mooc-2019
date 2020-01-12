
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int summa = 0;
        int laskuri = 0;
        
        System.out.print("Mihin asti? ");
        int mihin = Integer.valueOf(lukija.nextLine());
        
        while (laskuri <= mihin) {
            summa = summa + laskuri;
            laskuri++;
        }
        System.out.println("Summa on " + summa);

    }
}
