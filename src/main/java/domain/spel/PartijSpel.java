package domain.spel;

import domain.partij.Partij;
import domain.partij.PartijSpelOpties;
import domain.stemtest.StemTest;

public class PartijSpel extends Spel {
    private PartijSpelOpties partijSpelOpties;
    List<GekozenPartijStel>
    public PartijSpel(StemTest stemTest) {
        super(stemTest);
    }

    public void kiesPartij( Partij partij) {
        this.partij = partij;
    }

    public void zetOpties(PartijSpelOpties partijSpelOpties) {

        this.partijSpelOpties = partijSpelOpties;
    }
}
