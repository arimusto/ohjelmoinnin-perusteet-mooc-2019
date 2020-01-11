
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ari Mustonen
 */
public class Kurssipisteet {

    private ArrayList<Integer> pisteet;
    private int maksimipisteet;
    private int[] rajat;

    public Kurssipisteet(int maksimipisteet, int hyvaksymisraja, int raja2, int raja3, int raja4, int raja5) {
        this.pisteet = new ArrayList<>();
        this.maksimipisteet = maksimipisteet;
        this.rajat = new int[]{0, hyvaksymisraja, raja2, raja3, raja4, raja5};
    }

    public void lisaaKurssipisteita() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("-1")) {
                break;
            }

            int pisteet = Integer.valueOf(luettu);

            if (pisteet >= 0 && pisteet <= this.maksimipisteet) {
                this.pisteet.add(pisteet);
            }
        }
        this.naytaKeskiarvoKaikki();
        this.naytaKeskiarvoHyvaksytyt();
        this.naytaHyvaksymisprosentti();
        this.tulostaArvosanajakauma();
    }

    public void naytaKeskiarvoKaikki() {
        int osallistujia = 0;
        int summa = 0;
        for (int pist : this.pisteet) {
            summa += pist;
            osallistujia++;
        }
        double keskiarvo = 1.0 * summa / osallistujia;
        System.out.println("Pisteiden keskiarvo (kaikki): " + keskiarvo);
    }

    public void naytaKeskiarvoHyvaksytyt() {
        int osallistujia = 0;
        int summa = 0;
        for (int pist : this.pisteet) {
            if (pist >= this.rajat[1]) {
                summa += pist;
                osallistujia++;
            }
        }
        double keskiarvo = 1.0 * summa / osallistujia;
        System.out.print("Pisteiden keskiarvo (hyväksytyt): ");
        if (osallistujia == 0) {
            System.out.println("-");
        } else {
            System.out.println(keskiarvo);
        }
    }

    public void naytaHyvaksymisprosentti() {
        int osallistujia = 0;
        int hyvaksytyt = 0;
        for (int pist : this.pisteet) {
            if (pist >= this.rajat[1]) {
                hyvaksytyt++;
            }
            osallistujia++;
        }
        double prosentti = 100.0 * hyvaksytyt / osallistujia;
        System.out.println("Hyväksymisprosentti: " + prosentti);
    }

    public void tulostaArvosanajakauma() {
        int[] arvosanat = new int[]{0, 0, 0, 0, 0, 0};

        for (int pist : this.pisteet) {
            if (pist >= this.rajat[5]) {
                arvosanat[5]++;
            } else if (pist >= this.rajat[4]) {
                arvosanat[4]++;
            } else if (pist >= this.rajat[3]) {
                arvosanat[3]++;
            } else if (pist >= this.rajat[2]) {
                arvosanat[2]++;
            } else if (pist >= this.rajat[1]) {
                arvosanat[1]++;
            } else {
                arvosanat[0]++;
            }
        }

        System.out.println("Arvosanajakauma:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            this.tulostaTahtia(arvosanat[i]);
            System.out.println("");
        }
    }

    public void tulostaTahtia(int tahtia) {
        for (int i = 0; i < tahtia; i++) {
            System.out.print("*");
        }
    }
}
