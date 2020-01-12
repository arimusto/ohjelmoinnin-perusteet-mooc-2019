
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int tahdet = 1;
        while (tahdet <= maara) {
            System.out.print("*");
            tahdet++;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        int tyhjat = 1;
        while (tyhjat <= maara) {
            System.out.print(" ");
            tyhjat++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int rivi = 1;
        while (rivi <= koko) {
            tulostaTyhjaa(koko - rivi);
            tulostaTahtia(rivi);
            rivi++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        int rivi = 1;
        while (rivi <= korkeus) {
            tulostaTyhjaa(korkeus - rivi);
            tulostaTahtia(rivi + rivi -1);
            rivi++;
        }
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
