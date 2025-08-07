public class ParameterizedConstructor {

    private String accountHolder;
    private double balance;

    //Parameterized constructor with one parameter
    public ParameterizedConstructor(String name) {
        this.accountHolder = name;
        this.balance = 0.0; // default balance
        System.out.println("Account created for " + accountHolder + " with balance $" + balance);
    }
    //Parameterized constructor with two parameter
    public ParameterizedConstructor(String name, double initialDeposit) {
        this.accountHolder = name;
        this.balance = initialDeposit;
        System.out.println("Account created for " + accountHolder + " with balance $" + balance);
    }
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {      
        System.out.println(" PRIYADHARSHINI . M (2024503501) || Week4 Program 2 ");
        ParameterizedConstructor account1 = new ParameterizedConstructor("Aarav");
        ParameterizedConstructor  account2 = new ParameterizedConstructor("Riya", 3000);
        account1.displayInfo();
        account2.displayInfo();
}
}
