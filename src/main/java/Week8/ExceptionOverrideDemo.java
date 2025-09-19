class SuperClass {
 public void readData() throws java.io.IOException {
 System.out.println("Reading data in SuperClass...");
 throw new java.io.IOException("IO error in SuperClass");
 }
}
class SubClass extends SuperClass {
 @Override
 public void readData() {
 System.out.println("Reading data in SubClass...");
 throw new NullPointerException("Null pointer in SubClass");
 }
}
public class ExceptionOverrideDemo {
 public static void main(String[] args) {
 System.out.println("PRIYADHARSHINI M (2024503501) || Week 8 Program 
5");
 SuperClass obj = new SubClass();
 try {
 obj.readData();
 } catch (java.io.IOException e) {
 System.out.println("Caught IOException: " + e.getMessage());
 } catch (RuntimeException e) {
 System.out.println("Caught RuntimeException: " + e.getMessage());
 }
 }
}
