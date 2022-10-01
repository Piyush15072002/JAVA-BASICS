public class forEachLoop {
    public static void main(String[] args) throws Exception {

        String[] fighters = { "Goku", "Vegeta", "Gohan", "Trunks" };

        for (String fighter : fighters) {
            System.out.println(fighter);
        }

        int[] powers = { 100, 43, 56, 786, 34, 243, 56542, 2335 };

        for (int power : powers) {
            System.out.println(power);
        }

    }
}
