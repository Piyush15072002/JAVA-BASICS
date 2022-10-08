// Here we will define our own packages and import them to use

// random class
import java.lang.Math;

class Fighters {

    String[] fighters = { "Son Goku", "Prince Vegeta", "Son Gohan", "Lord Frieza", "Majin Buu", "Legendary Broly" };

    public void chooseFigther() {

        // remember that the random gives a double value so type cast it to the INT
        double num = Math.random();
        System.out.println(num);

    }

}

public class myPackages {
    public static void main(String[] args) {

        Fighters myFighter = new Fighters();

        myFighter.chooseFigther();

    }
}
