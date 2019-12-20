import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {
        // Mellemrummet i loopet laves med en ekstra String og så konkatenering.
        for (int i = 0; i < getBrugere().length; i++) {
            System.out.print(getBrugere()[i] + " ");
        }
        System.out.println();
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {
        String[] brugere = getBrugere();

        // Arrays.sort og Collections.reverseOrder fra java gør det nemt at sortere som opgaven vil have.
        Arrays.sort(brugere, Collections.reverseOrder());
        for (int i = 0; i < brugere.length; i++) {
            System.out.print(brugere[i] + " ");
        }
        System.out.println();
    }

    public void waitingFor0() {
        Scanner scanner = new Scanner(System.in);
        // input initialiseres med default input -1 således at loopet ikke klager.
        int input = -1;

        while (input != 0) {
            System.out.print("Venter på 0! Skriv et tal... ");
            // Her ændres input med brugerens tast således at loopet kan stoppe hvis der skrives 0.
            input = scanner.nextInt();
        }
        System.out.println("Du har tastet 0. Så det er slut!");
    }
}
