
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        int mjonoja = 0;
        
        while (true) {
            String mjono = lukija.nextLine();
            if (mjono.equals("loppu")) {
                System.out.println(mjonoja);
                break;
            }
            mjonoja = mjonoja + 1;
        }

    }
}
