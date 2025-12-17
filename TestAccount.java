/*Design the CheckingAccount class derived from the Account 
class with appropriate attributes and properties so that 
 the driver code can generate the output given below. */

public class TestAccount {
    public static void main(String[] args) {
        System.out.println("Total Checking Accounts: " + CheckingAccount.count);
        CheckingAccount c1 = new CheckingAccount();
        System.out.println("Account Balance: " + c1.showBalance());
        CheckingAccount c2 = new CheckingAccount(100.0);
        System.out.println("Account Balance: " + c2.showBalance());
        CheckingAccount c3 = new CheckingAccount(200.0);
        System.out.println("Account Balance: " + c3.showBalance());
        System.out.println("Total Checking Accounts: " + CheckingAccount.count);
    }
}

// class starts here

class Account { // parent class
    public double balance = 0.0;

    public Account(double balance) {
        this.balance = balance;
    }

    public double showBalance() {
        return balance;
    }
}

class CheckingAccount extends Account { // child class
    public static int count;

    public CheckingAccount() {
        super(0.0);
        count++;
    }

    public double showBalance() {
        return super.showBalance();
    }

    public CheckingAccount(double taka) {
        super(taka);
        count++;
    }
}
