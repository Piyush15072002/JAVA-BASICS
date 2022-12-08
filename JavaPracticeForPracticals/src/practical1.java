import java.util.Scanner;

public class practical1 {
    public static void main(String args[]) {

        // program to calculate the percent, grades of student

        Scanner marks = new Scanner(System.in);
        System.out.println("Enter your marks : ");

        float a = marks.nextInt();
        float b = marks.nextInt();
        float c = marks.nextInt();
        float d = marks.nextInt();
        float e = marks.nextInt();

        float total = a + b + c + d + e;

        float percentage = (float) (total / 500) * 100;

        System.out.println("Your p isrcentage is : " + percentage);

        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage < 90 && percentage >= 80) {
            System.out.println("B");
        } else if (percentage < 80 && percentage >= 70) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }

}
