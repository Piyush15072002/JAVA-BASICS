// An interface is like a blueprint of a class

// Interfaces are mainly used for the abstraction
// By default, all the interfaces are PUBLIC and has the keyword ABSTRACT 

interface Button {

    String color = "Green";

    void click();

    void submit();

}

// To extend one interface from other, use the EXTEND keyword, however, to use
// an interface into a class, use the keyword "IMPLEMENTS"

// We cannot create objects or instantiate the Interfaces

interface NavButton extends Button {

    String border = "1px";

    void Home();

    void contact();

}

class Web implements Button {

    String color = "Black";

    public void click() {
        System.out.println("Clicked on Button");
    };

    public void submit() {
        System.out.println("Form submitted successfully");
    }

}

// class Navbar implements navButton {

// String border = "2px";
// String color = "Red";

// public void Home() {
// System.out.println("Redirecting to home route");
// }

// public void contact() {
// System.out.println("Redirecting to contact route");
// }

// }

public class Interfaces {

    public static void main(String[] args) {

        Web login = new Web();

        login.click();

        login.submit();

        // login.home();

        // login.contact();

        // Web url = new Web();

        // System.out.println(url.color);

    }

}
