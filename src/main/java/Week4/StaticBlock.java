class StaticBlock{
    String accountHolder;
    double balance;
    static double interestRate;
    static {
        interestRate = 4.5;
        System.out.println("Static block executed. Interest rate set to " + interestRate + "%");
    }
   StaticBlock(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
        System.out.println("Constructor executed for: " + accountHolder);
    }
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args){
        System.out.println(" PRIYADHARSHINI . M (2024503501) || Week4 Program 7 ");
        StaticBlock acc1 = new StaticBlock("Riya", 6000);
        acc1.display();
        StaticBlock acc2 = new StaticBlock("Rohan", 56000);
        acc2.display();
}
}
