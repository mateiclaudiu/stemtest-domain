package domain;

public class AntwoordLeerling {
    private String user;
    private AntwoordOptie antwoordOptie;

    public AntwoordLeerling(String user, AntwoordOptie antwoordOptie) {

        this.user = user;
        this.antwoordOptie = antwoordOptie;
    }
}
