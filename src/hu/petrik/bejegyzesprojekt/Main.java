package hu.petrik.bejegyzesprojekt;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bejegyzesek bejegyzesLista = new Bejegyzesek();
        // 2db alap bejegyés
        Bejegyzes b1 = new Bejegyzes("Kovács István","A kiskutyusok olyan jók.");
        Bejegyzes b2 = new Bejegyzes("Svájci Arnold","Jó edzeni.");
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
        System.out.printf("\nA legnépszerűbb bejegyzés lájkjainak száma: %d",bejegyzesLista.legnepszerubb());
    }
}
