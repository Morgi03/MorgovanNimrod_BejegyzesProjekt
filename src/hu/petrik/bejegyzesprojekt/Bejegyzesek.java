package hu.petrik.bejegyzesprojekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bejegyzesek {
    private List<Bejegyzes> bejegyzesek;

    public Bejegyzesek() {
        this.bejegyzesek = new ArrayList<>();
    }

    public void addBejegyzes(Bejegyzes b) {
        this.bejegyzesek.add(b);
    }

    public void kiir() {
        for (int i = 0; i < bejegyzesek.size(); i++) {
            System.out.println(bejegyzesek.get(i) + "\n");
        }
    }

    private static boolean isDigit(String szoveg) {
        if (szoveg == null) {
            return false;
        }
        try {
            int num = Integer.parseInt(szoveg);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void felhasznalotolValoAdatBekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg, hogy hány darab bejegyzést szeretne hozzáadni a listához:");
        String megadott_ertek = sc.nextLine();
        if (isDigit(megadott_ertek) && 0 <= Integer.parseInt(megadott_ertek)) {
            int darabSzam = Integer.parseInt(megadott_ertek);
            String szerzo;
            String tartalom;
            for (int i = 0; i < darabSzam; i++) {
                System.out.println("\nAdd meg a bejegyzés szerzőjének nevét:");
                szerzo = sc.nextLine();
                System.out.println("\nAdd meg a bejegyzés tartalmát:");
                tartalom = sc.nextLine();
                Bejegyzes b = new Bejegyzes(szerzo, tartalom);
                this.bejegyzesek.add(b);
            }
        } else {
            throw new RuntimeException("A beírt karakter nem természetes szám");
        }
    }
}
