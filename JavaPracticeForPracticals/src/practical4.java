class overload {

    public void move() {
        System.out.println("Move one step");
    }

    public void move(int x, int y) {
        System.out.println("Move to coordinates (" + x + "," + y + ")");
    }

    public void move(String direction) {
        System.out.println("Move one step to " + direction);
    }

    overload() {
        System.out.println("Game Started, Welcome to Overload");
    }

}

class override1 {
    void erase() {
        System.out.println("Erase all");
    }
}

class override2 extends override1 {
    void erase() {
        System.out.println("Erase only selected");
    }
}

public class practical4 {
    public static void main(String args[]) throws Exception {

        // Method overloading
        overload load = new overload();

        load.move();
        load.move(1203334, 24040503);
        load.move("Right");

        // Method overriding
        override1 ride1 = new override1();
        override2 ride2 = new override2();

        ride1.erase();
        ride2.erase();

    }

}
