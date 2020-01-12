
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        int vuorokaudet;
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        vuorokaudet = Integer.valueOf(lukija.nextLine());
        System.out.println(vuorokaudet * 24 * 60 * 60);
    }
}
