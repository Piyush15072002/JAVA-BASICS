import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Exceptions {
    public static void main(String[] args) {

        // Arithmetic exception

        int a = 100;
        int b = 0;

        try {
            int division = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Error Occured: " + e.getMessage());
        }

        // Array out of bounds exception

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        // now we will insert a new element for out of bound exception

        try {
            arr[11] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array does not have enough space : " + e.getMessage());
        }

        // Now we will see exception when we read a file tht does not exist

        // File("C:\\Users\\ACER\\Desktop\\JAVA\\Project2\\src\\myFile.txt");

        try {
            File myFile = new File("myFile.txt");

            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found : " + e.getMessage());
        }

    }
}
