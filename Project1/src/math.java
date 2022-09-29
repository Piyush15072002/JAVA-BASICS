public class math {
    public static void main(String[] args) throws Exception {

        // In java we already have the MATH class and we don't need to import it

        // round
        int roundUp = Math.round(2002F);
        System.out.println(roundUp);

        // ceil
        double ceilDown = Math.ceil(200.100); // since the result will be double so the datatype will change
        System.out.println(ceilDown);
        // or we can just cast the result to an integer

        int ceilD = (int) Math.ceil(200.400);
        System.out.println(ceilD);

        // same way there are many types of methods in the Math library

        // TO GENERATE A RANDOM NUMBER

        // always remember that the random always gives a DOUBLE

        double rand = Math.random();
        System.out.println(rand);

        // as u can see that the number is between 0 and 1
        rand = Math.random() * 100; // to get between 1 and 100

        System.out.println(rand);

        // now the result is double so we will round it

        rand = Math.round(Math.random() * 1000);

        System.out.println(rand);

        // to get int

        int randNum = (int) Math.round(rand);

        System.out.println(randNum);

    }
}
