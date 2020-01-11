import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // oma koodi
        System.out.print("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.print("Loppuosan pituus: ");
        int merkit = Integer.valueOf(lukija.nextLine());
        
        int pituus = sana.length() - merkit;
        
        String tulostettava = sana.substring(pituus);
        System.out.println("Tulos: " + tulostettava);
    }
}
