import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {
    public static void main(String[] args) {
        Quickmaths quickmaths = new Quickmaths();
        quickmaths.start();
    }

    public int gennemsnit(int a, int b) {
        return (a + b) / 2;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);

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
