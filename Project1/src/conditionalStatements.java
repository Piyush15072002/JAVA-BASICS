import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) throws Exception {

        Scanner ageValue = new Scanner(System.in);

        System.out.print("What is your age : ");

        int age = ageValue.nextInt();

        if (age < 18) {
            System.out.println("You are not eligible to drive");
        } else if (age >= 10 && age <= 70) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("You are too old to drive");
        }

    }
}
