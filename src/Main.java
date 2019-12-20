/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {
    public static void main(String[] args) {
        // Et objekt skal instantieres da hello metoden ikke er statisk.
        Main main = new Main();
        System.out.println(main.hello("András"));
    }

    public String hello(String navn) {
        // length metoden fra String klassen kan bruges til at finde tomme strenge.
        if (navn.length() == 0)
            return "Hello World!";
        else
            // Eksempel på konkatenering
            return "Hello " + navn + "!";
    }

}
