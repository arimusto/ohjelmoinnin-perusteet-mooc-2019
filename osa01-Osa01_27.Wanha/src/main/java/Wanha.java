
import java.util.Scanner;

public class Wanha {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        int vluku;
        System.out.println("Anna vuosiluku:");
        vluku = Integer.valueOf(lukija.nextLine());
        if (vluku < 2015) {
            System.out.println("Wanha!");
        }
    }
}
