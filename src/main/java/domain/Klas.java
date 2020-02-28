package domain;

import java.util.List;

public class Klas {
    private String id;
    private List<Les> lessen;

    public Klas(String id, List<Les> lessen) {

        this.id = id;
        this.lessen = lessen;
    }
}
