package oop.Polymorphism.Student_Person;

public class Main {
    public static void main(String args[]) {
        Student s = new Student(
                "Alimyon",
                "Cabahug",
                "Calipayan",
                Gender.FEMALE,
                19,
                130,
                60,
                "BS Biology",
                "2020-10002",
                2
        );

        Person p = new Student(
                "Ambongan",
                "Cabahug",
                "Calipayan",
                Gender.MALE,
                18,
                140,
                68,
                "BS PolSci",
                "2020-10003",
                1
        );

        s.display();
        p.display();
    }
}
