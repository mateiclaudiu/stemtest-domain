package domain.stemtest;

public class AntwoordPartij {
    String partijNaam;
    AntwoordOptie gekozenAntwoord;

    public AntwoordPartij(String partijNaam, AntwoordOptie gekozenAntwoord) {
        this.partijNaam = partijNaam;
        this.gekozenAntwoord = gekozenAntwoord;
    }
}
