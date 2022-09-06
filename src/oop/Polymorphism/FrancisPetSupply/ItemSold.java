package oop.Polymorphism.FrancisPetSupply;

//superclass
import java.text.DecimalFormat;

public class ItemSold {

    //declaring data fields
    private int invoiceNum;
    private String description;
    private double price;


    ItemSold(int invoiceNum, String description, double price){
        this.invoiceNum = invoiceNum;
        this.description = description;
        this.price = price;
    }

    public void display(){
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Invoice number : " + invoiceNum);
        System.out.println("Description : " + description);
        System.out.println("Price : Php " + df.format(price));
    }

    public int getInvoiceNum(){
        return invoiceNum;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }
}
