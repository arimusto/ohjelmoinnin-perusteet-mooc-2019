
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // omaa koodi
        int mjonoja = 0;
        
        while (true) {
            String mjono = lukija.nextLine();
            if (mjono.equals("loppu")) {
                break;
            }
            mjonoja++;
        }
        
        System.out.println(mjonoja);
    }
}
