// Here we will define our own packages and import them to use

// random class
import java.lang.Math;

class Fighters {

    String[] fighters = { "Son Goku", "Prince Vegeta", "Son Gohan", "Lord Frieza", "Majin Buu", "Legendary Broly" };

    public String chooseFigther() {

        // remember that the random gives a double value so type cast it to the INT
        int num = (int) (Math.floor((Math.random() * 6))); // since there are 6 fighters

        // now use that number to choose a random char from array

        String chosenFighter = fighters[num];

        System.out.println(chosenFighter);

        return chosenFighter;

    }

}

public class myPackages {
    public static void main(String[] args) {

        Fighters myFighter = new Fighters();

        String fighter = myFighter.chooseFigther();

        System.out.println(fighter);

    }
}
