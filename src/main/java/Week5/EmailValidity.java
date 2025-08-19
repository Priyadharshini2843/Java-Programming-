import java.util.Scanner;

public class EmailValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRIYADHARSHINI M (2024503501) || Week5 Program 8");
        System.out.print("Enter an email: ");
        String email = sc.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid Email");

            // Split into username and domain
            String[] parts = email.split("@");
            String username = parts[0];
            String domain = parts[1];

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }

    public static boolean isValidEmail(String email) {
        // Check total length = 25
        if (email.length() != 25) {
            return false;
        }

        // Check single @
        int atCount = email.length() - email.replace("@", "").length();
        if (atCount != 1) {
            return false;
        }

        // Split into username and domain
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }

        String username = parts[0];
        String domain = parts[1];

        // Username check: numbers, alphabets, underscore, hyphen, plus
        if (!username.matches("[A-Za-z0-9._\\-+]+")) {
            return false;
        }
        // Domain check: must end with .com, .in, or .edu
        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            return false;
        }
        return true;
}
}

