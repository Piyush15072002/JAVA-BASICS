// Multiple Inheritance

interface Person {

    void name();

    int id = 1;

}

interface Department {

    void rank();

    int depId = 10;

}

class Organization implements Person, Department {

    public void rank() {
        System.out.println("Authorized");
    }

    public void name() {
        System.out.println("Welcome sir");
    }

}

interface Employee extends Person, Department {

    int empId = 0;

    void work();

}

class Office implements Employee {

    public void work() {
        System.out.println("Working...");
    }

    public void rank() {
        System.out.println("Authorized");
    }

    public void name() {
        System.out.println("Welcome sir");
    }

}

public class MultipleInheritance {

    public static void main(String[] args) throws Exception {

        Organization a = new Organization();

        a.rank();
        a.name();

        System.out.println(a.id);
        System.out.println(a.depId);

        Office o = new Office();

        o.name();
        o.rank();
        o.work();

    }

}
