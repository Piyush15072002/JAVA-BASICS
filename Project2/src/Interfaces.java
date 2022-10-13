// An interface is like a blueprint of a class

// Interfaces are mainly used for the abstraction
// By default, all the interfaces are PUBLIC and has the keyword ABSTRACT 

interface Button {

    void click();

    void submit();

}

// To extend one interface from other, use the EXTEND keyword, however, to use
// an interface into a class, use the keyword "IMPLEMENTS"

// We cannot create objects or instantiate the Interfaces

interface navButton extends Button {

    void Home();

    void contact();

}

class Navbar implements Button {

    String webName = "DB Universe";

    public void click() {
        System.out.println("Clicked on Button");
    };

    public void submit() {
        System.out.println("Form submitted successfully");
    }

}

public class Interfaces {

    public static void main(String[] args) {

        Navbar login = new Navbar();

        login.click();

        login.submit();

    }

}
