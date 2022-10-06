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
        this.schoolName = name;
        this.fees = fees;
        System.out.println("School Created");
    }

}

// * There are 3 types of Inheritance
// 1. Single Inheritance
// 2. Multi-level inheritance
// 3. Heirarchical Inheritance

// There is another type called as "Multi Intheritence", but java does not
// support it

// Single level Inheritance

class student {

    String studentName;int class;

    public void info() {
        System.out.println("Info Loading...");
    }

    // Constructor

    Student(String studentName, int class){
        this.studentName = studentName;
        this.class = class;
        System.out.println("Student Created");
    }


}

public class Inheritance {
    public static void main(String[] args) throws Exception {

        // class School (parent class)
        School school1 = new School("KV Devlali", 1000);
        System.out.println();
        // class Student (child class)  - Single Inheritance

        Student student1 = new Student("Piyush Pant", 12);




    }
}
