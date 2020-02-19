package domain.spel;

public class DebatSpelOptie {
    String kleurEens;
    String kleurOneens;
    String kleurGeenMening;
    boolean argumentenToelaten;
    boolean moeilijkeWoordenTonen;


    public void zetKleuren(String kleurEens, String kleurOneens, String kleurGeenMening) {
        this.kleurEens = kleurEens;
        this.kleurOneens = kleurOneens;
        this.kleurGeenMening = kleurGeenMening;
    }

    public void argumentToelaten(){
        this.argumentenToelaten = true;
    }

    public void argumentNietToelaten(){
        this.argumentenToelaten = false;
    }


      public void moeilijkeWoordenTonen(){
        this.moeilijkeWoordenTonen = true;
    }

    public void moeilijkeWoordenNietTonen(){
        this.moeilijkeWoordenTonen = false;
    }

    public void overSlaanToestaan() {

    }
}
