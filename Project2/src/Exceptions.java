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

    }
}
