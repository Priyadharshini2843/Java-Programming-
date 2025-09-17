class InsufficientFundsException extends Exception { 
    private double balance; 
    private double shortfall; 
 
    public InsufficientFundsException(double balance, double shortfall) { 
        super("Insufficient funds! Balance: " + balance + ", Shortfall: " + 
shortfall); 
        this.balance = balance; 
        this.shortfall = shortfall; 
    } 
} 
class InvalidAmountException extends Exception { 
    public InvalidAmountException(String message) { 
        super(message); 
    } 
} 
class BankAccount { 
    private String accountId; 
    private double balance; 
 
    public BankAccount(String accountId, double balance) throws 
InvalidAmountException { 
        if (accountId == null || accountId.isEmpty()) { 
            throw new IllegalArgumentException("Account ID cannot be 
null/empty."); 
        } 
        if (balance < 0) { 
            throw new InvalidAmountException("Initial balance cannot be 
negative."); 
        } 
        this.accountId = accountId; 
        this.balance = balance; 
    } 
    public void deposit(double amount) throws InvalidAmountException { 
        if (amount <= 0) throw new InvalidAmountException("Deposit must be 
positive."); 
        balance += amount; 
    } 
 
    public void withdraw(double amount) throws InvalidAmountException, 
InsufficientFundsException { 
        if (amount <= 0) throw new InvalidAmountException("Withdrawal must 
be positive."); 
        if (amount > balance) throw new InsufficientFundsException(balance, 
amount - balance); 
        balance -= amount; 
    } 
    public void transfer(BankAccount target, double amount) 
            throws InvalidAmountException, InsufficientFundsException { 
        this.withdraw(amount); 
        target.deposit(amount); 
    } 
    public double getBalance() { 
        return balance; 
    } 
} 
class BankTest { 
    public static void main(String[] args) { 
        System.out.println("Priyadharshini M (2024503501) || WEEK8 Program 
2 "); 
        try { 
            BankAccount acc1 = new BankAccount("Person1", 1000); 
            BankAccount acc2 = new BankAccount("Person2", 500); 
 
            acc1.deposit(100); 
            acc1.withdraw(50); 
            acc1.transfer(acc2, 200); 
 
            System.out.println("Person1 Balance: " + acc1.getBalance()); 
            System.out.println("Person2 Balance: " + acc2.getBalance()); 
            acc1.withdraw(5000); 
        } 
        catch (Exception e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
} 
