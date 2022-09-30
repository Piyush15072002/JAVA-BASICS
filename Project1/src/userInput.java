import java.util.Scanner;

public class userInput {
    public static void main(String[] args) throws Exception {

        // there is a package in JAVA to take the input from the user called Scanner

        Scanner takeInput = new Scanner(System.in);
        // Note that we have to tell the compiler the place from where to take the
        // input, which is TERMINAL, so we will say System.in

        // ! System.in - take the input from the terminal
        // ! System.out - print the ouput in the terminal

        // since we instantiated the scanner, so we get some of its methods
        // * To store a particular type of value, there is the next method that we use

        byte age = takeInput.nextByte();

        System.out.println("Your age is " + age);

        // How will you put labels?
        // if you use the println, it will take u to the next terminal, so just use the
        // print keyword that will keep you in the same line

        Scanner input2 = new Scanner(System.in);

        // here we will add the label

        System.out.print("Enter your name : ");

        // next() is for String input
        String name = input2.next();

        System.out.println("Welcome " + name);

    }
}
