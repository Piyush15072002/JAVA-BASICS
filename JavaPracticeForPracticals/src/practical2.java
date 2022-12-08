public class practical2 {
    public static void main(String[] args) throws Exception {

        int age = 100;
        if (age > 100) {
            System.out.println("Damn you are old");
        } else {
            System.out.println("Live your life fully");
        }

        switch (age) {
            case 50:
                System.out.println("Half century");
                break;
            case 100:
                System.out.println("Old");
                break;
            default:
                System.out.println("No age");

        }

        for (int i = 0; i <= 100; i = i + 10) {
            System.out.println(i);
        }

        while (age < 201) {
            System.out.println(age);
            age = age + 10;
        }

    }
}
