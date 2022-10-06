class School {

    String schoolName;
    int fees;

    public void start() {
        System.out.println("The school starts now...");
    }

    public void end() {
        System.out.println("The school ends now...");
    }

}

// * There are 3 types of Inheritance
// 1. Single Inheritance
// 2. Multi-level inheritance
// 3. Heirarchical Inheritance

// There is another type called as "Multi Intheritence", but java does not
// support it

// Note that, the keyword EXTENDS is used to extend the class and perform
// INHERITANCE

// Single level Inheritance

class Student extends School {

    String studentName;
    int standard;

    public void info() {
        System.out.println("Info Loading...");
    }

    // Constructor

    // Student(String studentName, int standard) {
    // this.studentName = studentName;
    // this.standard = standard;
    // }

}

// Multi level

class Course extends Student {

    String courseName;

    // since we already have an info function in the Student class
    // and we define a new function with same name so
    // previous function will get overridden by this function
    // this is called as METHOD OVERRIDING

    public void info() {
        System.out.println(this.studentName);
    }

}

public class Inheritance {

    public static void main(String[] args) throws Exception {

        // class School (parent class)

        School school1 = new School();
        school1.schoolName = "KV";
        school1.fees = 1000;

        school1.start();

        // System.out.println(school1.schoolName);
        // System.out.println(school1.fees);

        // class Student (child class) - Single Inheritance
        Student student1 = new Student();
        student1.studentName = "Piyush Pant";
        student1.standard = 12;

        student1.info();

        student1.end();

    }
}
