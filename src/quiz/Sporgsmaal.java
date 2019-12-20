package quiz;

public class Sporgsmaal implements Translatable {
    // Private instansvariabel så der skal bruges getters og setters for at tilgå dem.
    private String sporgsmaalTekst;
    private int point;
    private Svar[] svar;
    private int rigtigeSvarIndex;


    // Alle setters og getters lavet automatisk med IntelliJ.

    public String getSporgsmaalTekst() {
        return sporgsmaalTekst;
    }

    public void setSporgsmaalTekst(String sporgsmaalTekst) {
        if (sporgsmaalTekst.length() <= 100)
            this.sporgsmaalTekst = sporgsmaalTekst;
        else
            throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        if (point >= 0)
            this.point = point;
        else
            throw new IllegalArgumentException("Point må ikke være negative.");
    }

    public Svar[] getSvar() {
        return svar;
    }

    public void setSvar(Svar[] svar) {
        this.svar = svar;
    }

    public int getRigtigeSvarIndex() {
        return rigtigeSvarIndex;
    }

    public void setRigtigeSvarIndex(int rigtigeSvarIndex) {
        this.rigtigeSvarIndex = rigtigeSvarIndex;
    }


    // Metoden som kræves af interfacen. Den er den samme som i Svar klassen men kunne sagtens være anderledes.
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
