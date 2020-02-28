package domain;

import java.util.Date;
import java.util.List;

public class StemTest {
    private String id;
    private String titel;
    private Date aanmaakDatum;
    private List<Stelling> stellingen;

    public StemTest(String id, String titel, Date aanmaakDatum, List<Stelling> stellingen) {
        this.id = id;
        this.titel = titel;
        this.aanmaakDatum = aanmaakDatum;
        this.stellingen = stellingen;
    }

    public Stelling kiesStelling(String id) {
        return stellingen.stream().filter(stelling -> stelling.getId().equals(id)).findFirst().get();
    }
}
