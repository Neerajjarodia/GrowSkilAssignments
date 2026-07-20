package employee;

public class BankAccount {
	
	 // Final variable
    final String ACCOUNT_TYPE = "Savings";

    // Instance variables
    long accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("---------------");
        System.out.println("Account Type      : " + ACCOUNT_TYPE);
        System.out.println("Account Number    : " + accountNumber);
        System.out.println("Account Holder    : " + accountHolderName);
        System.out.println("Balance           : " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                123456789L,
                "Rohan Sharma",
                85000.0);

        account.displayAccountDetails();

        // Compile-time error (cannot assign a value to final variable)
        // account.ACCOUNT_TYPE = "Current";
    }

}
