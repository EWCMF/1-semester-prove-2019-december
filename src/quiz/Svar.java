package quiz;

public class Svar implements Translatable {
    // Private instansvariabel så der skal bruges getters og setters for at tilgå dem.
    private String svarTekst;


    // Constructor'en gør at alle Svar objekter skal instantieres med en string.
    public Svar(String svarTekst) {
        this.svarTekst = svarTekst;
    }


    // Alle setters og getters lavet automatisk med IntelliJ.

    public String getSvarTekst() {
        return svarTekst;
    }

    public void setSvarTekst(String svarTekst) {
        this.svarTekst = svarTekst;
    }


    // Metoden som kræves af interfacen. Den er den samme som i Sporgsmaal klassen men kunne sagtens være anderledes.
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
