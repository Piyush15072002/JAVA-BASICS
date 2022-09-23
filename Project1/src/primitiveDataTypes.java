public class primitiveDataTypes {
    public static void main(String[] args) throws Exception {

        // there are two types of data types, Primitive and Reference

        // Primitive data types are used for storing the simple values whereas the
        // Reference data types are used to store the complex datatype

        // some of the primitive data types are
        // byte store in 1 bytes [-128, 127]
        // short store in 2 bytes [-32k, 32k]
        // int store in 4 bytes [-2B, 2B]
        // long store in 8 bytes

        // for Decimal values
        // float store in 4 bytes
        // double store in 8 bytes

        // char store in 2 bytes
        // boolean store in 1 bytes

        // since the age does not take values in billion so byte it okay
        byte age = 20;
        System.out.println(age);

        // To store the larger number
        int views = 100000000;
        System.out.println(views);

        // However, if we wanna format our number and make it like 12,343 so it is more
        // readable
        // but we cannot add comma, so we have _ in java

        int viewsCount = 1_00_000_000;
        System.out.println(viewsCount);

        // if the int number is larger than 2Billions then, u will get an error so use
        // datatype long, but problem is even u say long to compiler, it will take it as
        // an int, To solve this problem, we add a suffix L to the number
        long longNumber = 50000000000000000L;
        System.out.println(longNumber);

        // * To store decimal, we may choose the FLOAT, however the compiler see decimal
        // values as DOUBLE, so even if we call it float, compiler will give us error
        // to solve this, just add F or f and it will become float

        double micro = 231.939399933322434393;
        System.out.println(micro);

        float price = 1000.50F;
        float priceNew = 1000.60f;

        System.out.println(price);
        System.out.println(priceNew);

        // Char
        // you cannot store a string using char, just an alphabetic character under
        // single quotes, '' - character and "" - string
        char name = 'P';
        System.out.println(name);

        // Boolean
        boolean isStrong = true;
        System.out.println(isStrong);

    }
}
