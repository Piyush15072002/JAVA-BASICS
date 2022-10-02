// Constructors allocate the memory for the object
// their job is to contruct the object

// there are 3 types of constructors
// 1. Non-parameterized constructors
// 2. Parameterized constructors
// 3. Copy Constructor

//! Non Parameterized constructors
class Universe6 {

    String name;
    String rank;
    int power;

    public void info() {

        System.out.println(
                "Name : " + this.name + " ; " + "Rank : " + this.rank + " ; " + "Power : " + this.power + " ; ");

    }

    // Non parameterized constructor

    Universe6() { // Since there is no return type for constructors, so it is written straight
        System.out.println("New person added to Universe 6");
    }

    // even if we don't make a constructor in JAVA, our program still runs because
    // the java creates one constructor for us automatically, but now we made our
    // own so compiler will call ours

}

// ! Parameterized constructors
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

    Universe7(String name, String rank, int power) { // Passing Parameter

        this.name = name;
        this.rank = rank;
        this.power = power;

        System.out.println("New person added to Universe 7");
    }

    // ! Copy constructor

    // Copy constructor just copy an object and paste it in new object as its
    // initial value
    // just like for Parameterized constructors, we initialize them with a value
    // passed as parameters, but what if you want to copy an object and start its
    // value from there, then you use copy constructors

    Universe7(Universe7 participant) {

        // The passed parameter is the data type of an Object so it is Universe7

        this.name = participant.name;
        this.rank = participant.rank;
        this.power = participant.power;

        System.out.println("New Participant added!");
    }

}

class Tournament {

    String name;
    String rank;
    int power;

    public void info() {

        System.out.println(
                "Name : " + this.name + " ; " + "Rank : " + this.rank + " ; " + "Power : " + this.power + " ; ");

    }

    Tournament(Tournament participant) {
        // Tournament <name> is the type of declaration, which is an object of class

        this.name = participant.name;
        this.rank = participant.rank;
        this.power = participant.power;

        System.out.println("Participant is added");

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

        // Non Parameterized constructors
        U6_person1.name = "Lord Champa";
        U6_person1.power = 79;
        U6_person1.rank = "God of Destruction";

        U6_person1.info();

        // Calling Parameterized constructor of Universe7 class

        Universe7 U7_person1 = new Universe7("Beerus", "God of Destruction", 87);

        U7_person1.info();

        // Calling Copy constructor of Tournament class

        Universe7 U7_person2 = new Universe7(U7_person1);

        U7_person2.info();

    }

}