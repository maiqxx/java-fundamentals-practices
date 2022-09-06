package oop.Encapsulation.Person;

/**
 * 1. determine the different access modifiers for each of the attributes of a Person
 * 2. determine the constructor/s
 * 3. redo gender and create an enumeration for it.
 * 4. create enumerations for age as well (underage, legal age - 21 and above)
 * 5. add a BMI status instance variable and create an enumeration for it
 *      (underweight, normal weight, overweight, obese)
 * 6. create getters and setters depending on the access modifiers of the attributes have been defined
 * 7. create a method that checks whether a Person may join a full marathon.
 *      A person may join a full marathon only when his BMI is normal and he is of legal age.
 * */


public class Person {
    String firstName;
    String middleName;
    String lastName;
    char gender;
    int age;
    int height;
    int weight;

    Person(String firstName, String middleName, String lastName,
           char gender, int age, int height, int weight){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    char getGender(){
        return gender;
    }
    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    void displayPersonDetails(){
        System.out.println("Name: " +firstName + " " + middleName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println();
    }
}
