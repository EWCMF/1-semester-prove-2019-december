package quiz;

import java.util.Scanner;

public class Quiz {
    Sporgsmaal[] sporgsmaal;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sporgsmaal sporgsmaal1 = new Sporgsmaal();

        sporgsmaal1.setSporgsmaalTekst("Hvad hedder læreren i programmering?");
        Svar[] alleSvarTil1 = new Svar[]{new Svar("András"), new Svar("Anders"), new Svar("Karsten")};
        sporgsmaal1.setSvar(alleSvarTil1);
        sporgsmaal1.setRigtigeSvarIndex(0);

        System.out.println("Spørgsmål 1");
        System.out.println(sporgsmaal1.getSporgsmaalTekst());
        System.out.println();
        System.out.println("0: " + sporgsmaal1.getSvar()[0].getSvarTekst());
        System.out.println("1: " + sporgsmaal1.getSvar()[1].getSvarTekst());
        System.out.println("2: " + sporgsmaal1.getSvar()[2].getSvarTekst());

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
