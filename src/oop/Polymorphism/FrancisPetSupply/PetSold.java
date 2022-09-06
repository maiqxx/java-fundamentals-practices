package oop.Polymorphism.FrancisPetSupply;

//subclass
public class PetSold extends ItemSold{

    //declaring data fields
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    PetSold(int invoiceNum,
            String description,
            double price,
            boolean vaccinated,
            boolean neutered,
            boolean housebroken){

        super(invoiceNum, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.housebroken = housebroken;
    }


    public void display(){
        super.display();
        System.out.println("Vaccinated pet : " + vaccinated);
        System.out.println("Neutered pet : " + neutered);
        System.out.println("Housebroken pet : " + housebroken);
    }

    //getters and setters methods
    public void setVaccinated(boolean vaccinated){ this.vaccinated = vaccinated; }

    public boolean getVaccinated(boolean vaccinated){
        return vaccinated;
    }

    public void setNeutered(boolean neutered){
        this.neutered = neutered;
    }

    public boolean getNeutured(){
        return neutered;
    }

    public void setHousebroken(boolean housebroken){
        this.housebroken = housebroken;
    }

    public boolean getHousebroken(){
        return housebroken;
    }
}
