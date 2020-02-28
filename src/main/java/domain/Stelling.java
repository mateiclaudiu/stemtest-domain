package domain;

import java.util.List;

public class Stelling {
    private String id;
    private String text;
    private List<AntwoordOptie> antwoordOpties;
    private List<AntwoordPartij> antwoordPartijs;

    public Stelling(String id, String text, List<AntwoordOptie> antwoordOpties, List<AntwoordPartij> antwoordPartijs) {
        this.id = id;
        this.text = text;
        this.antwoordOpties = antwoordOpties;
        this.antwoordPartijs = antwoordPartijs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<AntwoordOptie> getAntwoordOpties() {
        return antwoordOpties;
    }

    public void setAntwoordOpties(List<AntwoordOptie> antwoordOpties) {
        this.antwoordOpties = antwoordOpties;
    }

    public List<AntwoordPartij> getAntwoordPartijs() {
        return antwoordPartijs;
    }

    public void setAntwoordPartijs(List<AntwoordPartij> antwoordPartijs) {
        this.antwoordPartijs = antwoordPartijs;
    }
}
