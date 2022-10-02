// In java, we can create class and their objects

// Creating a class is like defining a blueprint of something
// Imagine you are making a fighter system where all the best fighters of dragonball universe fighters will be registered
// before u list all the fighters, u need to create a blueprint of the data u want (like schema), this is called as Class

// Creating a class

class Fighter {

    // The class is defined
    // Every class have objects, which gets created on the basis of the class
    // the class have various properties and methods
    // methods are functions of the class

    // In Fighter class, there can be various properties and methods like

    // * Properties

    String name;
    int speed;
    int powerLevel;

    // * Methods

    public void fight() {
        System.out.println("Fighting...");
    }

    public void attack() {
        System.out.println("Attack...");
    }

    public void defend() {
        System.out.println("Defend...");
    }

    public float fighterScore() {

        // THIS keyword - it refers to the object

        float score = ((float) (this.speed + this.powerLevel) / 200) * 100;
        // float score = (float) (this.speed / 100) * 100;

        return score;
    }

}

// After you create a class, head to the MAIN() of the main class and create
// your object there

public class OOP1 {
    public static void main(String[] args) {

        // Here we will create the objects for our class

        Fighter fighter1 = new Fighter(); // new fighter object created

        fighter1.name = "Son Goku";
        fighter1.speed = 96;
        fighter1.powerLevel = 97;

        fighter1.fight();
        fighter1.attack();
        fighter1.defend();

        System.out.println(fighter1);

        System.out.println(fighter1.name + "'s score is " + fighter1.fighterScore());

    }
}
