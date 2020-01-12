
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        int tahdet = 1;
        while (tahdet <= maara) {
            System.out.print("*");
            tahdet++;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        int rivit = 1;
        while (rivit <= sivunpituus) {
            tulostaTahtia(sivunpituus);
            rivit++;
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        int rivit = 1;
        while (rivit <= korkeus) {
            tulostaTahtia(leveys);
            rivit++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int rivit = 1;
        while (rivit <= koko) {
            tulostaTahtia(rivit);
            rivit++;
        }
    }
}
