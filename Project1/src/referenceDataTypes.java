
// This package is imported for the Date command
import java.util.Date;

// Package for POINT
import java.awt.*;

public class referenceDataTypes {
    public static void main(String[] args) throws Exception {

        // Reference types are like
        // storing date, or mail message
        // they are complex objects

        // to store a reference data type, you need to allocate memory using the NEW
        // keyword, you may even need to use a package like for date

        Date today = new Date(); // new will allocate memory to the variable

        System.out.println(today);
        // println means print line

        // now that we have given memory for that, we have access to its properties
        // since it is like class

        today.getTime();

        // * Difference between reference type and primitive type

        byte x = 10;
        byte y = x;

        // updating x
        x = 20;

        // now the y is supposed to change as well since the value of x is changed but
        // it did not, y is still 10
        System.out.println(y);

        // There is a data type in JAVA, which is just like the POINTERS in C, which
        // store the address of the variable
        // like i said, when we assign a new reference type, we use the NEW to allocate
        // memory
        // the object is created and its address is stored, so every time someone access
        // it,
        // the address is called and from there the numbers are found, it just stores 2
        // values

        // JAVA calls it POINT and it comes from a package - java.awt

        Point coordinates = new Point(20, 30);

        Point newCoordinates = coordinates;

        // updating the coordinates

        coordinates.x = 10;

        System.out.println(newCoordinates);
        // You can seee that newCoordinates changed as well because they were pointing
        // to the address and not the object itself

    }
}

// ! Always remember that the reference type comes with objects that we can
// access inside like with date and point, just remember to use the NEW keyword
// and the package it came from
