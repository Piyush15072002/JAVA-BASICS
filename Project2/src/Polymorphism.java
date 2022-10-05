// Polymorphism means Having many forms

// Polymorphism is of two types
// 1. Function Overloading (Compile-time polymorphism)
// 2. Function Overriding (Run-time polymorphism)

//! Method Overloading (Compile-time polymorphism) or function overloading

class Car {

    String name;
    int price;

    // now we will declare various methods with same name (Methods are functions of
    // a class), but in each of the method, the parameter would be different

    public void info(String name) {
        System.out.println(name);
    }

    public void info(int price) {
        System.out.println(price);
    }

    public void info(String name, int price) {
        System.out.println(name + " : " + price);
    }
    // above there are 3 functions with same name but different parameters
    // they are same but have different uses, this is called as method overloading
    // when a class have many methods with same name but different parameters, it is
    // called as method overloading

    // Constructor
    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Polymorphism {
    public static void main(String[] args) throws Exception {

        Car c1 = new Car("BMW", 120000);

        // Calling our Method overloading

        c1.info(c1.name);
        c1.info(c1.price);
        c1.info(c1.name, c1.price);

    }
}
