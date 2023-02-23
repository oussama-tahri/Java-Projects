package bankaccountapp;

public class Checking extends Account {
    // List properties specific to the Checking accounts
    private int debitCardNumber;
    private int debitCardPin;


    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    public void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }


    // List any methods specific to checking accountS
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("-------\nYour Checking Account Features:" +
                "\n Debit Card Number: " +debitCardNumber +
                "\n Debit Card Pin: " +debitCardPin);
    }
}
