package quiz;

public interface Translatable {
    // Interfacet gør at alle der implementerer Translatable interfacen skal have denne her metode,
    // men de kan selv bestemme hvad metoden skal indeholde bortset fra at de skal retunere String og tage en String som argument.
    // Interfaces er en måde man kan se polymorfi i brug.
    String translate(String language);
}
