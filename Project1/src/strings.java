
public class strings {

    public static void main(String[] args) throws Exception {

        // To define a string in JAVA, use the 'String' data type
        // String datatype is a Reference type so it needs to be instantiated and given
        // memory
        // remember that, other than those 8 primitive type, all other are reference
        // types

        String message = new String("Mi Gatteno Gokui");

        // there is short way as well

        String who = "It's Goku, Son Goku";

        System.out.println(message);
        System.out.println(who);

        // since th string is a reference type, so it comes with various methods with it

        System.out.println(who.length());

        System.out.println(who.replace("Goku", "goku"));

        // ! Escape Sequences in JAVA

        // To add a ""

        String idea = "I have an \"Idea\" ! "; // put backslash around your ""
        System.out.println(idea);

        // but if u really need a \ how can you make it escape?
        // "path is c\asdf\" --> ERROR, therefore the correct method is

        String path = "Dragonballz\\saiyanSaga\\ep123"; // we need to add another \ to make it escape
        System.out.println(path);

        // New line
        idea = "\nOkay \nMy Idea is...\n";
        System.out.println(idea);

        // tab
        idea = "oh no \t I forgot it";
        System.out.println(idea);

    }

}