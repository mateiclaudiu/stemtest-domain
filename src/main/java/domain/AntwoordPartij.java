package domain;

public class AntwoordPartij {
    private String stellingId;
    private AntwoordOptie gekozenAntwoordOptie;

    public AntwoordPartij(String stellingId, AntwoordOptie gekozenAntwoordOptie) {
        this.stellingId = stellingId;
        this.gekozenAntwoordOptie = gekozenAntwoordOptie;
    }
}
