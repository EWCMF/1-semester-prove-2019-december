import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    // TODO Ret nedenstående datatyper
    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    String fritidsStringeresser; // Snitning, LOL, strikke
    String smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m
    int vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    int eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    Date opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    // TODO Vis eksempler på typecasting
    @Override
    public String toString() {
        return "Navn: " + navn + "\n" + "By: " + by + "\n" + "Karaktergennemsnit: " + (int) karaktergennemsnit + "\n" + "Dato: " + opdateretDato.toString();
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        person.karaktergennemsnit = 5.6;
        person.opdateretDato = new Date(100000000000L);
        System.out.println(person.toString());

        //Double lavet til int. Vist med sum metoden fra Quickmaths

        person.hojde = 1.98;

        // her bliver a 1 da der rundes ned.
        int a = (int) person.hojde;
        int b = 5;

        Quickmaths quickmaths = new Quickmaths();
        System.out.println("Sum af a og b: " + quickmaths.sum(a, b));
    }

}
