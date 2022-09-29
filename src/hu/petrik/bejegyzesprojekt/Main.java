package hu.petrik.bejegyzesprojekt;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bejegyzesek bejegyzesLista = new Bejegyzesek();
        // 2db alap bejegyés
        Bejegyzes b1 = new Bejegyzes("Kovács István","A kiskutyusok olyan jók.");
        Bejegyzes b2 = new Bejegyzes("Svájci Arnold","Jó edzeni.");
        bejegyzesLista.addBejegyzes(b1);
        bejegyzesLista.addBejegyzes(b2);
        bejegyzesLista.kiir();
    }
}
