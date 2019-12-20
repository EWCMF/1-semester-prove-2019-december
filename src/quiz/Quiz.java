package quiz;

import java.util.Scanner;

public class Quiz {
    Sporgsmaal[] sporgsmaal;

    public static void main(String[] args) {
        // Scanner med system input bruges til quiz.
        Scanner scanner = new Scanner(System.in);

        // Det ene sporgsmaal objekt instantieres her.
        Sporgsmaal sporgsmaal1 = new Sporgsmaal();

        // Setters bruges til at udfylde spørgsmålets indhold.
        sporgsmaal1.setSporgsmaalTekst("Hvad hedder læreren i programmering?");

        // Nye svar objekter laves direkte inde i dette array.
        Svar[] alleSvarTil1 = new Svar[]{new Svar("András"), new Svar("Anders"), new Svar("Karsten")};
        sporgsmaal1.setSvar(alleSvarTil1);
        sporgsmaal1.setRigtigeSvarIndex(0);

        // Getters bruges til at få spørgmålets Strings.
        System.out.println("Spørgsmål 1");
        System.out.println(sporgsmaal1.getSporgsmaalTekst());
        System.out.println();
        System.out.println("0: " + sporgsmaal1.getSvar()[0].getSvarTekst());
        System.out.println("1: " + sporgsmaal1.getSvar()[1].getSvarTekst());
        System.out.println("2: " + sporgsmaal1.getSvar()[2].getSvarTekst());

        // Det forventes at man skriver int her og programmet crasher hvis man skriver f.eks. String eller double.
        int ValgteSvar = scanner.nextInt();

        if (ValgteSvar == sporgsmaal1.getRigtigeSvarIndex()) {
            System.out.println("Korrekt! +5 point");
            sporgsmaal1.setPoint(5);
        } else {
            System.out.println("Forkert.");
        }

        System.out.println("Quizzen er slut. Du fik: " + sporgsmaal1.getPoint() + " point.");
    }
}
