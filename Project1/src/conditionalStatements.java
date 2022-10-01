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

        // Switch statement

        String rank = "Captain";

        switch (rank) {
            // note that, you need to break the loop cuz it will keep executing
            case "Lieutnant":
                System.out.println("1st");
                break;

            case "Captain":
                System.out.println("2nd");
                break;

            case "Major":
                System.out.println("3rd");
                break;

            default:
                System.out.println("Soldier");

        }

    }
}
