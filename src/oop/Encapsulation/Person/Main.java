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

public class Main {
    public static void main(String args[]){

        /**String firstName;
         String middleName;
         String lastName;
         char gender;
         int age;
         int height;
         int weight;*/

        Person p1 = new Person("Jamaica", "Plandiano", "Cavalida",
                'F', 20, 155, 60);

        Person p2 = new Person("Jairah", "Plandiano", "Cavalida",
                'F', 8, 129, 20);


        p1.displayPersonDetails();
        p1.getAge();
        p1.getHeight();
        p1.getWeight();

        p2.displayPersonDetails();
        p2.getAge();
        p2.getHeight();
        p2.getWeight();


    }
}
