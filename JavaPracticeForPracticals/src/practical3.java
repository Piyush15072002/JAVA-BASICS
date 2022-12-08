class Start {

    String name;

    public void move() {
        System.out.println("Game started...");

    }

    Start(String name) {
        this.name = name;
        System.out.println("Game initialized");
    }

}

public class practical3 {
    public static void main(String[] args) throws Exception {

        Start game = new Start("piyush");

        System.out.println(game.name);
    }
}