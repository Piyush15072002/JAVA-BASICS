
interface Person {

    void name();

    int id = 1;

}

interface Department extends Person {

    void rank();

}

class Organization implements Department {

    public void rank() {
        System.out.println("Authorized");
    }

    public void name() {
        System.out.println("Welcome sir");
    }

}

public class LabPractice {

    public static void main(String args[]) throws Exception {

        Organization a = new Organization();

        a.rank();
        a.name();

    }

}
