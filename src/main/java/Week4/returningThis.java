public class returningThis {
    String AccountHolder;
    double balance;
    returningThis(String AccountHolder, double balance) {
        this.AccountHolder = AccountHolder;
        this.balance = balance;
    }
    returningThis deposit(double amount) {
        this.balance += amount;
        return this;
    }
    void compareBalance(returningThis otherAccount) {
        if(this.balance > otherAccount.balance) {
            System.out.println(this.AccountHolder+" has more balance than "+otherAccount.AccountHolder);
        }
        else if(this.balance < otherAccount.balance) {
            System.out.println(otherAccount.AccountHolder+" has more balance than "+this.AccountHolder);
        }
        else {
            System.out.println("Both Accounts have the same amount ");
        }
    }
    void display() {
        System.out.println("Account Holder: "+AccountHolder);
        System.out.println("Balance: $"+balance);
    }
    public static void main(String[] args) {
        returningThis acc1 = new returningThis("Helen",4000);
        returningThis acc2 = new returningThis("Henry",8000);
        System.out.println(" PRIYADHARSHINI . M (2024503501) || Week4 Program 4 ");
        acc1.deposit(500).display();
        acc2.display();
        acc1.compareBalance(acc2);
    }
}
