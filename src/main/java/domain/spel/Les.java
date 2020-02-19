package domain.spel;

import domain.stemtest.Stelling;

import java.util.ArrayList;

public class Les {
    Spel spel;

    public Les() {
        gekozenStellingen = new ArrayList<>();
    }

    public void voegStellingToeUitStemTest(Stelling stellingUitStemtest) {
        spel.gekozenStellingen.add(new GekozenDebatStelling(stellingUitStemtest.id));
    }

    public void kiesSoortSpel(Spel spel) {
        this.spel = spel;
    }
}
