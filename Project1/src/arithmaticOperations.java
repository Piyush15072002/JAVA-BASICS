public class arithmaticOperations {
    public static void main(String[] args) throws Exception {

        // addition

        int add = 100 + 303403;

        System.out.println(add);

        // division

        int div = 1000 / 3;
        System.out.println(div);

        // Notice that the result is not in decimal but just in integer
        // if we want the decimal result than, do this

        // div = (double)1000 / (double)3

        // it will convert the type of 1000 and 3 to DOUBLE, this is typecasting
        // however, an error will come saying that the expression gives double result
        // but it is declared as a integer, That is why we will do this

        double divs = 1000 / 3;
        System.out.println(divs); // result would be just 333.0
        // the result is just in decimal but it isn't accurate yet
        // so we will convert the types of values as well

        double divss = (double) 1000 / (double) 3;
        System.out.println(divss); // this gives us 333.33333 , so it's correct way

    }
}
