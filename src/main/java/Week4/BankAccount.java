class BankAccount {
    // Object-level (instance) data
    String accountHolder;
    double balance;
   // Class-level (static) data
    static double interestRate = 5.0;
    static int totalAccounts = 0;
   // Constructor (instance method)
    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
        totalAccounts++; 
    }
    // Instance method: requires an object
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    // Static method: can be called without creating object
    static void showBankStats() {
        System.out.println("Interest Rate (Class-Level): " + interestRate + "%");
        System.out.println("Total Accounts Created (Class-Level): " + totalAccounts);
        // System.out.println(accountHolder);Not Allowed
    }

    public static void main(String[] args) {
        // Call static method without creating any object
        System.out.println(" PRIYADHARSHINI . M (2024503501) || Week4 Program 6 ");
        BankAccount.showBankStats();
        System.out.println();
          //Create account objects
        BankAccount acc1 = new BankAccount("Liju", 10000);
        BankAccount acc2 = new BankAccount("Aakash", 7000);
         //Call instance methods
        acc1.display();
        System.out.println();
        acc2.display();
        System.out.println();
         
        BankAccount.showBankStats();
}
}
