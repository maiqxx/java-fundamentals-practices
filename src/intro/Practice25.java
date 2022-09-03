package intro;

/**
 Cindy uses the services of a brokerage firm to buy and sell stocks. The firm charges 1.5% service charges on
the total amount for each transaction, buy or sell. When cindy sells stocks, she would like to know if she
gained or lost on a particular investment. Write a program that allows cindy to input the number of shares
sold, the purchase price of each share, and the selling price of each share. The program outputs the amount
invested, the total service charges, amount gained or lost, and the amount received after selling the stock.
 */

import javax.swing.JOptionPane;
public class Practice25 {
    public static void main(String[] args){

        //declaring variables
        double brokerageFee = 0.015;
        double purchasePrice;
        double salePrice;
        double totalFees;
        double amountInvested;
        double netAmount;
        int noOfSharesSold;
        String input;
        String output;

        //getting inputs
        input = JOptionPane.showInputDialog("Enter the shares that were sold: ");
        noOfSharesSold = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the selling price of each share: ");
        salePrice = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the purchase price: ");
        purchasePrice = Double.parseDouble(input);

        //calculation
        amountInvested = noOfSharesSold * purchasePrice;
        totalFees = (noOfSharesSold * salePrice) * brokerageFee;
        netAmount = (noOfSharesSold * salePrice) - totalFees;

        //displays output
        output = "Amount Invested: $" + amountInvested + "\n" +
                "Sevice Charges: $" + totalFees + "\n" +
                "Profit / Loss: $" + (netAmount - amountInvested) + "\n" +
                "Amount Recieved After Selling the Stock: $" + (netAmount - amountInvested);
        JOptionPane.showMessageDialog(null, output, "Investment Status", JOptionPane.INFORMATION_MESSAGE);
    }
}
