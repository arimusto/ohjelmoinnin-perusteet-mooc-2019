
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }

    public static int pienin(int[] taulukko) {
        // kirjoita koodia tähän
        int pienin = taulukko[0];
        int indeksi = 1;
        while (indeksi < taulukko.length) {
            if (taulukko[indeksi] < pienin) {
                pienin = taulukko[indeksi];
            }
            indeksi++;
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        // kirjoita koodia tähän
        int pienin = taulukko[0];
        int pienimmanIndeksi = 0;
        int indeksi = 1;
        while (indeksi < taulukko.length) {
            if (taulukko[indeksi] < pienin) {
                pienimmanIndeksi = indeksi;
                pienin = taulukko[indeksi];
            }
            indeksi++;
        }
        return pienimmanIndeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        // kirjoita koodia tähän
        int pienin = taulukko[aloitusIndeksi];
        int pienimmanIndeksi = aloitusIndeksi;
        while (aloitusIndeksi < taulukko.length) {
            if (taulukko[aloitusIndeksi] < pienin) {
                pienin = taulukko[aloitusIndeksi];
                pienimmanIndeksi = aloitusIndeksi;
            }
            aloitusIndeksi++;
        }
        return pienimmanIndeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        // kirjoita koodia tähän
        int temp = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = temp;
    }

    public static void jarjesta(int[] taulukko) {
        int taulukonKoko = taulukko.length;
        int indeksi = 0;
        while (indeksi < taulukonKoko - 1) {
            int pienimmanIndeksi = Paaohjelma.pienimmanIndeksiAlkaen(taulukko, indeksi);
            Paaohjelma.vaihda(taulukko, pienimmanIndeksi, indeksi);
            System.out.println(Arrays.toString(taulukko));
            indeksi++;
        }
    }

}
