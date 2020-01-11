
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        while (true) {
            String merkkiJono = lukija.nextLine();
            if (merkkiJono.equals("")) {
                break;
            }
            String[] sanat = merkkiJono.split("\\s+");
            int indeksi = 1;
            while (indeksi < sanat.length) {
                System.out.println(sanat[indeksi]);
                indeksi = indeksi + 2;
            }
        }

    }
}
