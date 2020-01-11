
import java.util.ArrayList;
import java.util.Scanner;

public class ListanViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                System.out.println(lista.get(lista.size() - 1));
                break;
            }

            lista.add(luettu);
        }

    }
}
