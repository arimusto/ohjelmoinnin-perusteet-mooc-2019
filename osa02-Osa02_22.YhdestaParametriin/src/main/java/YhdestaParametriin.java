
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

    }
    
    public static void tulostaLukuunAsti(int luku) {
        int tulosta = 1;
        while (tulosta <= luku) {
            System.out.println(tulosta);
            tulosta++;
        }
    }

}
