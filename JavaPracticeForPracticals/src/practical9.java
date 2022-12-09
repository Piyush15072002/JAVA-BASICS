public class practical9 {
    public static void main(String[] args) throws Exception {

        try {

            int a = 100 / 0;
            System.out.println(a);

        } catch (ArithmeticException e) {
            System.out.println(e);

        }

        try {
            int age[] = new int[10];
            age[11] = 12;

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
