package hu.petrik.bejegyzesprojekt;

import java.time.LocalDateTime;
import java.util.List;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        this.szerkesztve = LocalDateTime.now();
        isContentEdited = true;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like() {
        this.likeok++;
    }

   private boolean isContentEdited = false;

    @Override
    public String toString() {
        if (isContentEdited) {
            return String.format("%s – %d - %s\nSzerkesztve: %s\n%s", this.szerzo, this.likeok, this.letrejott.toLocalDate()+" "+this.letrejott.toLocalTime().getHour()+":"+this.letrejott.toLocalTime().getMinute(), this.szerkesztve.toLocalDate()+" "+this.szerkesztve.toLocalTime().getHour()+":"+this.szerkesztve.toLocalTime().getMinute(), this.tartalom);
        } else {
            return String.format("%s – %d - %s\nSzerkesztve: %s\n%s", this.szerzo, this.likeok, this.letrejott.toLocalDate()+" "+this.letrejott.toLocalTime().getHour()+":"+this.letrejott.toLocalTime().getMinute(), "A létrehozást követően még nem volt.", this.tartalom);
        }
    }
}
