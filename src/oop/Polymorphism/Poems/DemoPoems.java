package oop.Polymorphism.Poems;

/**
 * Date: 11/13/2021
 * */

/**
* 3. Create a class named Poem that contains fields for the name
* of the poem and the number of lines in it. Include a constructor
* that requires values for both fields. Also include get methods
* to retrieve field values. Create three subclasses: Couplet,
* Limerick, and Haiku. The constructor for each subclass requires
* only a title; the lines field is set using a constant value.
*  A couplet has two lines, a limerick has five lines, and a
* haiku has three lines. Create an application that demonstrates
* usage of an object of each type. Save the files as Poem.java,
* Couplet.java, Limerick.java, Haiku.java, and DemoPoems.java.
* */

//main class
public class DemoPoems {
    public static void main(String[] args){

        //objects with assigned constant variables
        Poem couplet = new Couplet("Couplet", 2);
        Poem limerick = new Limerick("Limerick", 5);
        Poem haiku = new Haiku("Haiku", 3);

        //displays the titles and the number of lines of the poems
        System.out.println("Poem Title : " + couplet.getPoemName() + ", Number of Lines : " + couplet.getNumOfLines());
        System.out.println("Poem Title : " + limerick.getPoemName() + ", Number of Lines : " + limerick.getNumOfLines());
        System.out.println("Poem Title : " + haiku.getPoemName() + ", Number of Lines : " + haiku.getNumOfLines());
    }
}
