public class operators {
    public static void main(String[] args) throws Exception {
        int temp = 40;

        boolean isHot = temp < 50 && temp > 30;

        System.out.println(isHot);

        boolean isNormal = temp == 24 || temp == 25;

        System.out.println(isNormal);

    }
}
