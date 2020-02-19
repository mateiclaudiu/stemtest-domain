package domain.spel;

import domain.stemtest.StemTest;

public class Spel {
    StemTest stemTest;

    public Spel(StemTest stemTest) {
        this.stemTest = stemTest;
    }

    public void toonAlleStellingenMetHunAntwoordOpties() {
        stemTest.getStellingen()
    }
}
