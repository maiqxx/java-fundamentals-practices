package intro;

/**
 A movie in a local theater is in great demand. The theater owner has decided to donate to a local charity a
portion of the gross amount generated from the movie. This example designs and implements a program
that prompts the user to input the movie name, adult ticket price, child ticket price, number of adult tickets
sold, number of child tickets sold and percentage of the gross amount to be donated to the charity. The
output of the program is shown below.
 */

import javax.swing.JOptionPane;
public class Practice24 {
    public static void main(String[] args){

        //declaring variable
        String movieName;
        double adultTicketCosts;
        double childTicketCosts;
        int noOfAdultTicketSold;
        int noOfChildTicketSold;
        double donationPercentage;
        double grossAmount;
        double donatedAmount;
        double netSaleAmount;
        String input;
        String output;

        //getting inputs
        movieName = JOptionPane.showInputDialog("Enter the movie name: ");
        input = JOptionPane.showInputDialog("Enter the price of an adult ticket: ");
        adultTicketCosts = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the price of a child ticket: ");
        childTicketCosts = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the number of adult tickets sold: ");
        noOfAdultTicketSold = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the number of child tickets sold: ");
        noOfChildTicketSold = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the percentage donated: ");
        donationPercentage = Double.parseDouble(input);

        //calculation
        grossAmount = adultTicketCosts * noOfAdultTicketSold + childTicketCosts * noOfChildTicketSold;
        donatedAmount = grossAmount * donationPercentage / 100;
        netSaleAmount = grossAmount - donatedAmount;

        //displays output
        output = "Movie Name: " + movieName + "\n" +
                "Number of Tickets Sold: " + noOfAdultTicketSold + "\n" +
                "Gross Amount: " + grossAmount + "\n" +
                "Percentage of Gross Amount Donated: " + donationPercentage+ "%" + "\n" +
                "Amount Donated: " +  "\n" + donatedAmount + "\n" +
                "Net Sale: " + "$" + netSaleAmount + "\n";
        JOptionPane.showMessageDialog(null, output, "Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
