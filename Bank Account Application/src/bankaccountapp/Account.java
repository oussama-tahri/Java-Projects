package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    private String name;
    private String sSN; // social security number
    private double balance;
    private static int index = 1000;

    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;


        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        //
        setRate();
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }


    public abstract void setRate();


    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" +accruedInterest);
        showBalance();
    }


    // List common methods
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" +amount);
        showBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" +amount);
        showBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" +amount+ " to " +toWhere);
        showBalance();
    }

    public void showBalance() {
        System.out.println("Your balance is now: $"+balance);
    }


    public void showInfo() {
        System.out.println("NAME: " + name + "\n" +
                "ACCOUNT NUMBER: " + accountNumber + "\n" +
                "BALANCE: " + balance + "\n" +
                "RATE: " + rate + "%");
    }
}
