package hu.petrik.bejegyzesprojekt;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println(bejegyzesek.get(i)+"\n");
        }
    }
}
