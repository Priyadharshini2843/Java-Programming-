public class TransactionList {
    private static class Node {
        String transaction;
        Node next;

        Node(String transaction) {
            this.transaction = transaction;
            this.next = null;
        }
    }
    private Node head;
    public void addTransaction(String transaction) {
        Node newNode = new Node(transaction);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Transaction added: " + transaction);
    }
    public void searchTransaction(String transaction) {
        Node current = head;
        int position = 1;
        boolean found = false;

        while (current != null) {
            if (current.transaction.equalsIgnoreCase(transaction)) {
                System.out.println("Transaction found at position " + position + ": " + current.transaction);
                found = true;
                break;
            }
            current = current.next;
            position++;
        }

        if (!found) {
            System.out.println("Transaction not found: " + transaction);
        }
    }
    public void deleteTransaction(String transaction) {
        if (head == null) {
            System.out.println("No transactions to delete.");
            return;
        }

        if (head.transaction.equalsIgnoreCase(transaction)) {
            head = head.next;
            System.out.println("Transaction deleted: " + transaction);
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.transaction.equalsIgnoreCase(transaction)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Transaction deleted: " + transaction);
        } else {
            System.out.println("Transaction not found: " + transaction);
        }
    }
    public void showTransactions() {
        if (head == null) {
            System.out.println("No transactions to show.");
            return;
        }

        System.out.println("All Bank Transactions:");
        Node current = head;
        while (current != null) {
            System.out.println("- " + current.transaction);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        TransactionList list = new TransactionList();

        list.addTransaction("Deposit $5000");
        list.addTransaction("Withdraw $1500");
        list.addTransaction("Transfer $2000 to Rahul");
        list.addTransaction("Deposit $1000");

        list.showTransactions();

        list.searchTransaction("Withdraw $1500");
        list.searchTransaction("Deposit $999");

        list.deleteTransaction("Transfer $2000 to Rahul");
        list.deleteTransaction("Deposit $999");  

        list.showTransactions();
    }
}
