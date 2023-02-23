package bankaccountapp;

public class Savings extends Account {
    // List properties specific to the Savings accounts
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    public void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }


    // List any methods specific to savings accounts
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("-------\nYour Savings Account Features:" +
                            "\n Safety Deposit Box ID: " +safetyDepositBoxID +
                            "\n Safety Deposit Box Key: " +safetyDepositBoxKey);
    }
}
