class School {

    String schoolName;
    int fees;

    public void start() {
        System.out.println("The school starts now...");
    }

    public void end() {
        System.out.println("The school ends now...");
    }

    // Constructor

    School(String schoolName, int fees) {
        super(schoolName, fees);
        // this.schoolName = schoolName;
        // this.fees = fees;

    }

}

// * There are 3 types of Inheritance
// 1. Single Inheritance
// 2. Multi-level inheritance
// 3. Heirarchical Inheritance

// There is another type called as "Multi Intheritence", but java does not
// support it

// Note that, the keyword EXTENDS is used to extend the class and perform
// INHERITANCE8

// Single level Inheritance

class Student extends School {

    String studentName;

    int standard;

    public void info() {
        System.out.println("Info Loading...");
    }

    // Constructor

    Student(String studentName, int standard) {
        this.studentName = studentName;
        this.standard = standard;
    }

}

public class Inheritance {

    public static void main(String[] args) throws Exception {

        // class School (parent class)
        School school1 = new School("KV Devlali", 1000);
        System.out.println(school1.schoolName);
        System.out.println(school1.fees);

        // class Student (child class) - Single Inheritance
        Student student1 = new Student("Piyush Pant", 12);

    }
}
