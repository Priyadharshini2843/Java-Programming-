import java.util.Scanner;
public class RedYellowGreen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("Priyadharshini.M (2024503501) ");
        System.out.print("Enter the color of the traffic light (red, yellow, green): ");
        String color = sc.nextLine().toLowerCase(); 
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready to move");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }

        sc.close();
    }
  
