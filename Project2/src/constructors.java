
class Universe6 {

    String name;
    int power;
    String rank;

    public void info() {

        System.out.println(
                "Name : " + this.name + " ; " + "Rank : " + this.rank + " ; " + "Power : " + this.power + " ; ");

    }

}

public class constructors {

    public static void main(String[] args) throws Exception {

        // Constructors allocate the memory for the object
        // their job is to contruct the object

        // there are 3 types of constructors
        // 1. Non-parameterized constructors
        // 2.
        // 3.

        Universe6 person1 = new Universe6(); // Universe6() is the constructor

        // * Properties of Constructors
        // the name of the constructor is same as the name of the class
        // Constructors do not have any return type ( like int, float, etc)
        // For an object, the constructor can execute only one time

        person1.name = "Lord Champa";
        person1.power = 79;
        person1.rank = "God of Destruction";

        person1.info();

    }

}