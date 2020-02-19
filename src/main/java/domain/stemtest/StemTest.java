package domain.stemtest;

import java.util.ArrayList;
import java.util.List;

public class StemTest {
    List<Stelling> stellingen;

    public StemTest() {
        this.stellingen = new ArrayList<>();
    }

    public void voegStellingToe(Stelling stelling){
        stellingen.add(stelling);
    }

    public List<Stelling> getStellingen() {
        return stellingen;
    }

    public Stelling selecteerStelling(int id) {
         return stellingen.stream().filter(stelling -> stelling.id == id).findFirst().get();
    }
}
