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

}

class Navbar implements Button {

}

public class Interfaces {

    public static void main(String[] args) {

    }

}
