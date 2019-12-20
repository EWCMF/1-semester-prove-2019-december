import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {
    public static void main(String[] args) {
        // Objekt instantieres da ingen af de andre metoder i klassen er statiske.
        Quickmaths quickmaths = new Quickmaths();
        quickmaths.start();
    }

    // Husk parentes ellers divideres b med 2 før additionen.
    public int gennemsnit(int a, int b) {
        return (a + b) / 2;
    }

    // Denne metode er bare en simpel addition.
    public int sum(int a, int b) {
        return a + b;
    }

    public void start() {
        // loopet fortsætter uendeligt da der ikke er nogen variable der kan gøre loop condition false.
        while (true) {
            // Scanner til system input.
            Scanner scanner = new Scanner(System.in);

            // Samme form som på billedet.
            System.out.println("**** Quickmaths ****");

            System.out.print("Indtast A:");
            int a = scanner.nextInt();

            System.out.print("Indtast B:");
            int b = scanner.nextInt();

            System.out.println("Sum: " + sum(a, b));
            System.out.println("Gennemsnit: " + gennemsnit(a, b));
            System.out.println("-----------------");
        }
    }
}
