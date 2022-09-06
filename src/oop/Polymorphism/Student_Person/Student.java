package oop.Polymorphism.Student_Person;

public class Student extends Person {
    String program;
    String studentNumber;
    int yearLevel;

    public Student() {
        program = "BS Computer Science";
        studentNumber = "2020-10001";
        yearLevel = 1;
    }

    public Student(
            String firstName,
            String middleName,
            String lastName,
            Gender gender,
            int age,
            double height,
            double weight,
            String program,
            String studentNumber,
            int yearLevel
    ) {
        super(firstName, middleName, lastName, gender, age, height, weight);
        this.program = program;
        this.studentNumber = studentNumber;
        this.yearLevel = yearLevel;
    }

    public void display(){
        super.display();
        System.out.println("Program: " + program);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Year Level: " + yearLevel);

        // to demonstrate, let's print the value of firstName here
        System.out.println("First Name again: " + firstName);
    }
}
