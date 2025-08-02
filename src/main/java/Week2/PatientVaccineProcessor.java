import java.util.Scanner;

public class PatientVaccineProcessor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Priyadharshini.M (2024503501) ");
        System.out.print("Enter patient's age: ");
        int age = sc.nextInt();
        if (age >= 18 && age <= 65) {
            System.out.print("Enter 3-digit appointment number: ");
            int appointmentNumber = sc.nextInt();
            if (appointmentNumber >= 100 && appointmentNumber <= 999) {
                if (appointmentNumber % 2 == 0) {
                    System.out.println("Assigned: Priority Slot");
                } else {
                    System.out.println("Assigned: Regular Slot");
                }
                int lastDigit = appointmentNumber % 10;
                switch (lastDigit) {
                    case 1:
                        System.out.println("Gift: Pen");
                        break;
                    case 2:
                        System.out.println("Gift: Mask");
                        break;
                    case 3:
                        System.out.println("Gift: Sanitizer");
                        break;
                    default:
                        System.out.println("No special gift.");
                        break;
                }

            } else {
                System.out.println("Invalid appointment number. Must be a 3-digit number.");
            }

        } else {
            System.out.println("Not eligible for vaccination.");
        }

    
    }
}
