public class DefaultConstructor{
    String AccountHolder;
    double balance;
    void createAccount() {
        System.out.println("Account Holder Name: "+ AccountHolder);
        System.out.println("Account Balance: "+ balance);
    }
    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println(" PRIYADHARSHINI . M (2024503501) || Week4 Program 1 ");
        obj.createAccount();
    }
}
