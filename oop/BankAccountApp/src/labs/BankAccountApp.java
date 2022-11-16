package labs;

public class BankAccountApp {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("454545454", 3000);
        BankAccount acc2 = new BankAccount("665522822", 10000);
        BankAccount acc3 = new BankAccount("784858484", 10000000);

        acc1.setName("Oussama");
        System.out.println(acc1.getName());
        acc1.makeDeposit(1000);
        acc1.payBill(500);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest{
    //properties of bank account
    private static int iD = 1000;
    private String accountNumber; // iD + random 2-digit number + first 2 of SSN
    private static final String routingNumber = "07002223";
    private String name;
    private String SSN; // Social Service Number
    private double balance;

    // Constructor
    public BankAccount(String SSN, double initDeposit){
        balance = initDeposit;
        this.SSN = SSN;
        iD++;
        setAccountNumber();
    }

    private void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + SSN.substring(0,2);
        System.out.println("Your Account Number: " + accountNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        System.out.println("Paying Bill : " +amount);
        showBalance();
    }

    public void makeDeposit(double amount) {
        System.out.println("Making Deposit : " +amount);
        balance = balance + amount;
        showBalance();
    }

    public void showBalance() {
        System.out.println("Balance : " +balance);
    }

    @Override
    public void accrue() {
        balance = balance + (1 + rate / 100);
        showBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", SSN='" + SSN + '\'' +
                ", balance=" + balance +
                '}';
    }
}