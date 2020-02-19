package domain.spel;

import domain.stemtest.AntwoordOptie;

public class AntwoordOpDebatVanLeerling {
    String argument;
    AntwoordOptie gekozenAntwoord;
    GekozenDebatStelling stelling;

    public AntwoordOpDebatVanLeerling(String argument, AntwoordOptie gekozenAntwoord) {
        this.argument = argument;
        this.gekozenAntwoord = gekozenAntwoord;
    }

    public AntwoordOpDebatVanLeerling(AntwoordOptie gekozenAntwoord) {
        this.gekozenAntwoord = gekozenAntwoord;
    }
}
