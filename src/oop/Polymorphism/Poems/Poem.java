package oop.Polymorphism.Poems;


//super class
public class Poem {

    //declaring the data fields
    private String poemName;
    private int numOfLines;

    public Poem(String poemName, int numOfLines){
        this.poemName = poemName;
        this.numOfLines = numOfLines;
    }

    //getter method for the poem's title
    public String getPoemName(){
        return poemName;
    }

    ////getter method for the poem's number of lines
    public int getNumOfLines(){
        return numOfLines;
    }

}
