
import java.util.Scanner;

public class Totuusarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        boolean totuus;
        System.out.println("Syötä jotain!");
        totuus = Boolean.valueOf(lukija.nextLine());
        System.out.println("Totta vaiko ei? " + totuus);
    }
}
