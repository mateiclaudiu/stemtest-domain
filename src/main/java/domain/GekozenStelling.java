package domain;

import com.sun.deploy.net.MessageHeader;

import java.util.List;

public class GekozenStelling {
    private Stelling stelling;
    private List<AntwoordLeerling> antwoordLeerlingen;

    public GekozenStelling(Stelling stelling) {
        this.stelling = stelling;
    }

    public void antwoorden(String user, AntwoordOptie antwoordOptie) {
        antwoordLeerlingen.add(new AntwoordLeerling(user, antwoordOptie));
    }
}
