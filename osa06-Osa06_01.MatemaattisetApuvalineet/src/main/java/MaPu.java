
import java.util.ArrayList;

public class MaPu {

    // toteuta apumetodit tänne
    public static double keskiarvo(ArrayList<Integer> luvut) {
        int summa = 0;
        int lukuja = 0;
        for (int luku: luvut) {
            summa += luku;
            lukuja++;
        }
        return 1.0 * summa / lukuja;
    }
}
