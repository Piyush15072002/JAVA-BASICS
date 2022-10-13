// Packages in JAVA - They are like container which carry similiar functions and properties
// there are two types of packages in java, BUILT-IN and USER-DEFINED

// ACCESS MODIFIER
// They define which thing will be accessible to whom
// there are 4 types of access modifiers in JAVA, however, there are only 3 in C++
// they are PUBLIC, PRIVATE, PROTECTED and DEFAULT

class Database {

    // Everyone can access it
    public String name;

    // only sub classes of other package can access it
    public String id;

    // No one can access it
    private String password; // even when we create object, they cannot see it or use it

    // To access the private things, we use the GETTERS AND SETTERS

    // We cannot access the private things directly so we use functions to access
    // them via it

    // Getters - to get value
    public String getPassword() {
        return this.password;
    }

    // Setters - To update or set value
    public String setPassword(String pass) {
        return this.password = pass;

    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Database d1 = new Database();

        d1.name = "Project1"; // public
        System.out.println(d1.name);

        d1.id = "P1"; // protected
        System.out.println(d1.id);

        // Protected
        d1.setPassword("P1IsMine"); 
        System.out.println(d1.getPassword());

    }
}
