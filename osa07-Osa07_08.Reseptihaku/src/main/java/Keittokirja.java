
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
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
public class Keittokirja {

    private HashMap<String, Resepti> keittokirja;

    public Keittokirja() {
        this.keittokirja = new HashMap<>();
    }

    public void lueReseptitTiedostosta(String tiedosto) {
        ArrayList<String> tiedostoArray = new ArrayList<>();

        try (Scanner tiedostonlukija = new Scanner(new File(tiedosto))) {

            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                tiedostoArray.add(rivi);
            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        ArrayList<String> tuote = new ArrayList<>();
        for (int i = 0; i < tiedostoArray.size(); i++) {

            if (!tiedostoArray.get(i).trim().isEmpty()) {
                tuote.add(tiedostoArray.get(i));
            }

            if (tiedostoArray.get(i).trim().isEmpty() || i == tiedostoArray.size() - 1) {
                String nimi = tuote.get(0);
                String aika = tuote.get(1);
                tuote.remove(nimi);
                tuote.remove(aika);
                int keittoaika = Integer.valueOf(aika);
                this.keittokirja.put(nimi, new Resepti(nimi, keittoaika, tuote));
                tuote.clear();
            }
        }
    }

    public void listaaReseptit() {
        System.out.println("\nReseptit:");
        for (String resepti : this.keittokirja.keySet()) {
            System.out.println(this.keittokirja.get(resepti));
        }
    }

    public void haeReseptiaNimella(String nimi) {
        System.out.println("\nReseptit:");
        for (String resepti : this.keittokirja.keySet()) {
            if (resepti.contains(nimi)) {
                System.out.println(this.keittokirja.get(resepti));
            }
        }
    }

    public void haeReseptiaKeittoajalla(int maxAika) {
        System.out.println("\nReseptit:");
        for (String resepti : this.keittokirja.keySet()) {
            if (this.keittokirja.get(resepti).getKeittoaika() <= maxAika) {
                System.out.println(this.keittokirja.get(resepti));
            }
        }
    }

    public void haeReseptiaAineella(String aine) {
        System.out.println("\nReseptit:");
        for (String resepti : this.keittokirja.keySet()) {
            if (this.keittokirja.get(resepti).getRaakaAineet().contains(aine)) {
                System.out.println(this.keittokirja.get(resepti));
            }
        }
    }
}
