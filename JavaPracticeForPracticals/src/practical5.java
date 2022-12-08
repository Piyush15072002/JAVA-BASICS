class A {
    public void wish() {
        System.out.println("Good Day!");
    }
}

class B extends A { // Single inheritance
    public void greet() {
        System.out.println("Hiiiiiiiiiiiiiiiiiiiiii");
    }
}

class C extends B { // Multilevel inheritance
    public void depart() {
        System.out.println("Byeeeeeeeee");
    }
}

class D extends A { // Heirarchical inheritance

    public void all() {
        System.out.println("Hi, Good day and BYEEE");
    }
}

public class practical5 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.wish();

        b.wish();
        b.greet();

        c.wish();
        c.greet();
        c.depart();

        d.wish();
        d.all();

    }

}
