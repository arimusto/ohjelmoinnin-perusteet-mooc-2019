
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        //oma koodi
        while (true) {
            String teksti = lukija.nextLine();
            if (teksti.equals("lopeta")) {
                System.out.println("hurraa!");
                break;
            }
            System.out.println("hip!");
        }

    }
}
