abstract class abs {
    abstract void create();
}

class abstraction extends abs {
    void create() {
        System.out.println("This is abstraction baby");
    }
}

public class practical6 {
    public static void main(String[] args) {
        abstraction abs = new abstraction();
        abs.create();
    }
}
