package quiz;

public class Svar implements Translatable {
    private String svarTekst;

    public Svar(String svarTekst) {
        this.svarTekst = svarTekst;
    }


    public String getSvarTekst() {
        return svarTekst;
    }

    public void setSvarTekst(String svarTekst) {
        this.svarTekst = svarTekst;
    }

    @Override
    public String translate(String language) {
        if (language.equals(Language.Danish))
            return "Oversættelse er ikke muligt endnu";
        else if (language.equals(Language.English))
            return "Translation is not available yet";
        else
            return "";
    }
}
