import java.util.Scanner;
public class UserPassword{
        public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "priya";
        String correctPassword = "9639";
        int failCount = 0;
        String username, password;
        System.out.println("Priyadharshini.M (2024503501) ");
        System.out.println("Login System (type 'exit' to quit)");
         while (true){
            System.out.print("\nEnter username: ");
            username = sc.nextLine();
            if (username.equalsIgnoreCase("exit")) {
                break;
            }
           System.out.print("Enter password: ");
            password = sc.nextLine();
            if (username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login successful!");
            } 
            else if (!username.equals(correctUsername) && !password.equals(correctPassword)){
                failCount++;
                System.out.println("Login failed (non-admin with wrong password).");
                System.out.println("Fail count: " + failCount);
            } else 
            {
                System.out.println("Login failed.");
            }
        }
              System.out.println("\nFinal Fail Count (non-admin wrong attempts): " + failCount);
       
    }
}
