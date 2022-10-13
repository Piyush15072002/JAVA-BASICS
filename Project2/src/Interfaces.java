// An interface is like a blueprint of a class

// Interfaces are mainly used for the abstraction
// By default, all the interfaces are PUBLIC and has the keyword ABSTRACT 

interface Button {

    String color = "black";

    void click();

    void submit();

}

// To extend one interface from other, use the EXTEND keyword, however, to use
// an interface into a class, use the keyword "IMPLEMENTS"

// We cannot create objects or instantiate the Interfaces

interface navButton {

    String border = "2px";

    void Home();

    void contact();

}

class Web implements Button {

    String webName = "DB Universe";

    public void click() {
        System.out.println("Clicked on Button");
    };

    public void submit() {
        System.out.println("Form submitted successfully");
    }

}

class Navbar implements navButton {

    public void Home() {
        System.out.println("Redirecting to home route");
    }

    public void contact() {
        System.out.println("Redirecting to contact route");
    }

}

public class Interfaces {

    public static void main(String[] args) {

        Web login = new Web();

        login.click();

        login.submit();

        Web url = new Web();

        System.out.println(url.color);

        System.out.println(url.webName);

        Navbar b1 = new Navbar();

        b1.Home();
        b1.contact();
        // System.out.println(b1.color); // this is from the button interface
        System.out.println(b1.border);
    }

}
