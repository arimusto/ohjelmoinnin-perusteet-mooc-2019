
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int possumma = 0;
        int poslukuja = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            if (luku < 0) {
                continue;
            }
            poslukuja = poslukuja + 1;
            possumma = possumma + luku;
        }
        if (poslukuja == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            double keskiarvo = 1.0 * possumma / poslukuja;
            System.out.println(keskiarvo);
        }

    }
}
