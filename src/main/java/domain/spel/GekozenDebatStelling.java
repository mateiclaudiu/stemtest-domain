package domain.spel;

import java.util.List;

public class GekozenDebatStelling extends GekozenSpelStelling {
    int stellingId;
    boolean argumentToelaten;
    List<AntwoordOpDebatVanLeerling> antwoordLeerlingen;

    public GekozenDebatStelling(int id) {
        stellingId = id;
    }

    public void argumentToelaten() {
        argumentToelaten = true;
    }

    public void argumentNietToelaten() {
        argumentToelaten = false;
    }

    public void geefAntwoordOpties(){

    }
}
