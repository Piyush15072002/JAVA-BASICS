// Constructors allocate the memory for the object
// their job is to contruct the object

// there are 3 types of constructors
// 1. Non-parameterized constructors
// 2. Parameterized constructors
// 3.

class Universe6 {

    String name;
    String rank;
    int power;

    public void info() {

        System.out.println(
                "Name : " + this.name + " ; " + "Rank : " + this.rank + " ; " + "Power : " + this.power + " ; ");

    }

    // Non parameterized constructor

    Universe6() { // this is a constructor
        System.out.println("New person added to Universe 6");
    }

    // even if we don't make a constructor in JAVA, our program still runs because
    // the java creates one constructor for us automatically, but now we made our
    // own so compiler will call ours

}

class Universe7 {

    String name;
    String rank;
    int power;

    public void info() {

        System.out.println(
                "Name : " + this.name + " ; " + "Rank : " + this.rank + " ; " + "Power : " + this.power + " ; ");

    }

    // Parameterized constructor
    // we can initialize our own values as we declare a new object

    Universe7(String name, String rank, int power) { // this is a constructor

        this.name = name;
        this.rank = rank;
        this.power = power;

        System.out.println("New person added to Universe 7");
    }

}

public class constructors {

    public static void main(String[] args) throws Exception {

        Universe6 U6_person1 = new Universe6(); // Universe6() is the constructor
        // now the universe6 constructor will run and allocate the memory

        // * Properties of Constructors
        // the name of the constructor is same as the name of the class
        // Constructors do not have any return type ( like int, float, etc)
        // For an object, the constructor can execute only one time

        U6_person1.name = "Lord Champa";
        U6_person1.power = 79;
        U6_person1.rank = "God of Destruction";

        U6_person1.info();

        // Calling Parameterized constructor of Universe7 class

        Universe7 U7_person1 = new Universe7("Beerus", "God of Destruction", 87);

        U7_person1.info();

    }

}