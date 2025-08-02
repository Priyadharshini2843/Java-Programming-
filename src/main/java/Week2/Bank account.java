public class BankAccount {
    private static int totalAccounts=0;//Static variable
    private int accountNumber;//Non-static variable
    private double balance;//Non-static variable
    BankAccount(int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(int amount){
        int depositAmount=amount;//Local variable
        balance+=depositAmount;

        System.out.println("Account Number: "+accountNumber);
        System.out.println("Deposited Amount: "+depositAmount);
        System.out.println("Balance: "+balance);
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
}


public class BankApplication{
public static void main(String[] args){
       BankAccount obj1=new BankAccount(393,20000);
       BankAccount obj2=new BankAccount(905,1500);
       System.out.println("Priyadharshini.M (2024503501)");
       obj1.deposit(5000);
       obj2.deposit(400);
       System.out.println("Total Accounts created: "+BankAccount.getTotalAccounts());
}
}
