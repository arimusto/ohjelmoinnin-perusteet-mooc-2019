
import java.util.ArrayList;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                int viimeinenIndeksi = lista.size() - 1;
                System.out.println(lista.get(0));
                System.out.println(lista.get(viimeinenIndeksi));
                break;
            }

            lista.add(luettu);
        }

    }
}
