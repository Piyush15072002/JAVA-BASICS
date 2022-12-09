interface car {
    public void drive();
}

class bmw implements car {
    public void drive() {
        System.out.println("Driving...");
    }
}

interface bike extends car {
    public void accelerate();
}

class bmwBikes implements bike {
    public void accelerate() {
        System.out.println("BOOOOOOOOOOOOOOOM");
    }

    public void drive() {
        System.out.println("Wear helmet and drive");
    }

}

// class UNindia implements state {
// public void StateGDP() {
// System.out.println("State GDP is 1/29th of the actual GDP");
// }

// public void gdp() {
// System.out.println("GDP of the state");
// }
// }

public class practical7 {
    public static void main(String[] args) {

        bmw model1 = new bmw();
        model1.drive();

        bmwBikes model2 = new bmwBikes();
        model2.drive();
        model2.accelerate();
    }
}
