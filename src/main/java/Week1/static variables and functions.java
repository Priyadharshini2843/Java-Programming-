public class Bank {

    // Static variables
    static double interestRate = 3.5; // in percentage
    static double totalBankMoney = 0;
    static int totalAccounts = 0;

    // Instance variables
    int accountNo;
    double balance;

    // Constructor to create a new account
    public Bank(int accountNo, double initialBalance) {
        this.accountNo = accountNo;
        this.balance = initialBalance;
        totalBankMoney += initialBalance;
        totalAccounts++;
    }

    // Static method to deposit money
    public static void deposit(Bank account, double amount) {
        if (amount > 0) {
            account.balance += amount;
            totalBankMoney += amount;
            System.out.println("Deposited $" + amount + " to account " + account.accountNo);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Static method to withdraw money
    public static void withdraw(Bank account, double amount) {
        if (amount > 0 && amount <= account.balance) {
            account.balance -= amount;
            totalBankMoney -= amount;
            System.out.println("Withdrew $" + amount + " from account " + account.accountNo);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Static method to display account details
    public static void display(Bank account) {
        System.out.println("Account No: " + account.accountNo);
        System.out.println("Balance: $" + account.balance);
    }

    // Static method to display bank-level stats
    public static void displayBankStats() {
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Bank Money: $" + totalBankMoney);
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        Bank acc1 = new Bank(1001, 5000);
        Bank acc2 = new Bank(1002, 3000);

        deposit(acc1, 1500);
        withdraw(acc2, 500);

        display(acc1);
        display(acc2);

        displayBankStats();
    }
}