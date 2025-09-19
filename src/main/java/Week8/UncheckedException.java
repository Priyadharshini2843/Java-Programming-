public class UncheckedException {
 public static void main(String[] args) {
 String input = "abc";
 System.out.println("Priyadharshini M (2024503501) || WEEK8 
Program 4 ");
 try {
 int num = Integer.parseInt(input);
 int result = num / 0;
 System.out.println(result);
 }
 catch (Exception e) {
 System.out.println("Runtime Exception: " + e.getMessage());
 }
 }
}
