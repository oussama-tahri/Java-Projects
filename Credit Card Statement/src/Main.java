import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*                  Read a credit card CSV statement
        Creating a balance variable that calculates the running balance of the user’s account
        If the field says CREDIT, then add the amount to the balance
        If the field says DEBIT, then subtract the amount to the balance
        If the final amount is greater than zero, charge a 10% fee and warn the user
        If the final amount is zero, thank the user for their payments
        If the final amount is less than zero, thank the user for their payment and display their overpayment.



        Use this data for your test, or generate your own:

        Sep02,credit,CostCo,342.23
        Sep09,Credit,ATT,93.42
        Sep10,CREDIT,Applebees,56.20
        Sep11,CREDIT,AppleStore,995.95
        Sep12,DEBIT,ACHPayment,500
        Sep19,CREDIT,Speedway,35.09
        Sep20,CREDIT,McDonalds,12.55
        Sep21,DEBIT,ACHPayment,600
        Sep26,DEBIT,ACHPayment,250
        Sep30,FEE,MasterCard,2.50 */


        // this method will read data from CSV file
        List<String[]> transactions = new ArrayList<String[]>();
        String filename = "path of CSV file (.csv)";
        String dataRow;
        double balance = 0;

        try {
            // Open the file
            BufferedReader br = new BufferedReader(new FileReader(filename));

            // Read the data as long as it's not empty
            while ((dataRow = br.readLine()) != null){
                // Parse the data by commas
                String[] line = dataRow.split(",");
                // Add the data to collection
                transactions.add(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("DATE | TRANSACTION | VENDOR | AMOUNT | BALANCE");
        for (String[] transaction : transactions){
            String date = transaction[0];
            String type = transaction[1];
            String vendor = transaction[2];
            double amount = Double.parseDouble(transaction[3]);
            System.out.print(date + " | " + type + " | " + vendor + " | " + " | $" + amount);

            if (type.equalsIgnoreCase("credit")) {
                balance = balance + amount;
            }
            else if (type.equalsIgnoreCase("debit")) {
                balance = balance - amount;
            }
            else {
               // System.out.println("some other transaction");
            }
            System.out.print(" | " + balance + "\n");

        }

        // Check the balance
        if (balance > 0){
            System.out.println("You have a balance of : " +balance);
            System.out.println("You are charged a 10% fee of : " +balance * .10);
            System.out.println("Your new balance is : " +balance * 1.1);
        } else if (balance < 0) {
            System.out.println("Thanks for your payments.");
            System.out.println("You have an overpayment of -" + balance);
        }
        else {
            System.out.println("Thank for your payment !");
        }

    }
}