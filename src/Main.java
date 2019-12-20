/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.hello("András"));
    }

    public String hello(String navn) {
        if (navn.length() == 0)
            return "Hello World!";
        else
            return "Hello " + navn + "!";
    }

}
