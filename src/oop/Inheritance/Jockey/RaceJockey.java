package oop.Inheritance.Jockey;

public class RaceJockey extends Jockey{

    private int numberOfRaces;

    //method for getting the number of races
    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    //method for setting the number of races
    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }
}
