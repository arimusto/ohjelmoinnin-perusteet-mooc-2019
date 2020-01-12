
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int luvut = 0;
        int ykkoset = 0;
        double osuus;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            if (luku == 1) {
                ykkoset = ykkoset + 1;
            }
            luvut = luvut + 1;
        }
        if (luvut == 0) {
            System.out.println("ykkösten osuutta ei voida laskea");
        } else {
            osuus = 1.0 * ykkoset / luvut;
            System.out.println(osuus);
        }

    }
}
