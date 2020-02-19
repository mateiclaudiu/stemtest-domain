package domain.spel;

import domain.stemtest.StemTest;

import java.util.List;

public class DebatSpel extends Spel{
    List<GekozenDebatStelling> stellingen;
    DebatSpelOptie debatSpelOptie;

    public DebatSpel(StemTest stemTest) {
        super(stemTest);
    }

    public void stelKleurenIn(String kleurEens, String kleurOneens, String kleurGeenMening) {
        debatSpelOptie.zetKleuren(kleurEens,kleurOneens,kleurGeenMening);
    }

    public GekozenDebatStelling getStelling(int id) {
        return stellingen.stream().filter(stelling -> stelling.stellingId==id).findFirst().get();
    }

    public void argumentenToelaten() {
        debatSpelOptie.argumentToelaten();
        stellingen.stream().forEach(s -> s.argumentToelaten());
    }

    public void argumentenNietToelaten() {
        debatSpelOptie.argumentNietToelaten();
        stellingen.stream().forEach(s -> s.argumentNietToelaten());
    }

    public void moeilijkeWoordenTonen() {
        debatSpelOptie.moeilijkeWoordenTonen();
    }

    public void overSlaanToestaan() {
        debatSpelOptie.overSlaanToestaan();
    }
}
