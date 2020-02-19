package domain.stemtest;

import java.util.ArrayList;
import java.util.List;

public class Stelling {
    int id;
    String stellingTekst;
    List<AntwoordOptie> antwoordOpties;
    List<AntwoordPartij> antwoordPartij;

    public Stelling(int id) {
        this.id = id;
        antwoordPartij = new ArrayList<>();
    }

    public void vulStellingTekstIn(String stellingTekst) {
        this.stellingTekst = stellingTekst;
    }

    public void voegAntwoordOptiesToe(List<AntwoordOptie> asList) {
        antwoordOpties = asList;
    }

    public void bepaalAntwoordVanPartij(AntwoordPartij antwoordPartij) {
           this.antwoordPartij.add(antwoordPartij);
    }
}
