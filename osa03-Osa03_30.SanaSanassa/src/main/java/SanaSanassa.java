
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        System.out.print("Anna 1. sana: ");
        String sana1 = lukija.nextLine();
        System.out.print("Anna 2. sana: ");
        String sana2 = lukija.nextLine();
        
        if (sana1.indexOf(sana2) != -1) {
            System.out.println("Sana '" + sana2 + "' on sanan '" + sana1 + "' osana.");
        } else {
            System.out.println("Sana '" + sana2 + "' ei ole sanan '" + sana1 + "' osana.");
        }
    }
}
