public class ConstructorChaining {
    String AccountHolder;
    double balance;
    //no-parameter constructor
    ConstructorChaining() {
        this("Unknown",0.0);
        System.out.println("No-parameter Constructor called");
    }
    //Single-parameter Constructor
    ConstructorChaining(String name) {
        this(name,3000.0);
        System.out.println("One-parameter Constructor called");
    }
    //Two-parameter Constructor
    ConstructorChaining(String name,double balance) {
        this.AccountHolder = name;
        this.balance = balance;
        System.out.println("Two-parameter Constructor called");
    }
    void display() {
        System.out.println("Account Holder: "+AccountHolder);
        System.out.println("Balance: $ "+balance);
    }
    public static void main(String[] args) {
        ConstructorChaining acc1 = new ConstructorChaining();
        ConstructorChaining acc2 = new ConstructorChaining("Nobita");
        ConstructorChaining acc3 = new ConstructorChaining("Kenry",6000);
        System.out.println(" PRIYADHARSHINI . M (2024503501) || Week4 Program 5 ");
        acc1.display();
        acc2.display();
        acc3.display();
    }
}
