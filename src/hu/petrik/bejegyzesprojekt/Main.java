package hu.petrik.bejegyzesprojekt;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Bejegyzesek bejegyzesLista = new Bejegyzesek();
        // 2db alap bejegyés
        Bejegyzes b1 = new Bejegyzes("Kovács István", "A kiskutyusok olyan jók.");
        Bejegyzes b2 = new Bejegyzes("Svájci Arnold", "Jó edzeni.");
        bejegyzesLista.addBejegyzes(b1);
        bejegyzesLista.addBejegyzes(b2);
        //  bejegyzesLista.kiir();
        bejegyzesLista.felhasznalotolValoAdatBekeres();
        //  bejegyzesLista.kiir();
        try {
            bejegyzesLista.fileBeolvasas("bejegyzesek.csv");
        } catch (IOException e) {
            System.err.println("Hiba történt a fájl beolvasása során.");
        }
        // System.out.println("-------------------------");
        // bejegyzesLista.kiir();
        // System.out.println("-------------------------");
        bejegyzesLista.likeOsztas();
        // bejegyzesLista.kiir();
        // System.out.println("-------------------------");
        bejegyzesLista.masodikTartalomModositasa();
        System.out.println("\nA végleges lista:\n");
        bejegyzesLista.kiir();
        System.out.printf("\nA legnépszerűbb bejegyzés lájkjainak száma: %d\n", bejegyzesLista.legnepszerubb());
        System.out.printf("\n%s 35-nél több lájkkal rendelkező bejegyzés.\n", (bejegyzesLista.vane35nelTobbLike() ? "Van" : "Nincs"));
        System.out.printf("\n%d darab olyan bejegyzés van, amely kevesebb mint 15 lájkkal rendelkezik.\n", bejegyzesLista.tizenotnelKevesebbLike());
        System.out.println("\nRendezett lista:\n");
        bejegyzesLista.rendezesCsokkenoSorrendbe();
    }
}
