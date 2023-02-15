package it.develhope.annotations;

/**
 * This is a tester class
 * @author alessiolimina
 */

public class Start {
    public static void main(String[] args) {

        System.out.println("-----------------Starting-------------------");

        /**
         * calling the static method sayWelcome;
         * calling the static method sayGoodbye; 
         */

        Greetings.sayWelcome();
        Greetings.sayGoodbye();

        System.out.println("--------------------------------------------");
    }
}
