
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

    }

}