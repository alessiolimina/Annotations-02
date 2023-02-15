package it.develhope.annotations;

/**
 * This is a class that includes greetings
 * @author alessiolimina
 */

public class Greetings {

    /**
     * creating new static methods;
     * the first method sayWelcome says welcome;
     * sayWelcome has a custom annotation @DevAnnotation: it was written by John Walker;
     * the second method sayGoodbye says goodbye;
     * also sayGoodbye has a @DevAnnotation: it was written by Mark Brown;
     */

    @DevAnnotation(DevName = "John", DevSurname = "Walker")
    public static void sayWelcome(){
        System.out.println("Welcome");
    }
    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    public static void sayGoodbye(){
        System.out.println("Goodbye");
    }

}
