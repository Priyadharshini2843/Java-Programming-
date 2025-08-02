import java.util.Scanner;
class Temperature{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Priyadharshini.M (2024503501)");

System.out.println("Enter Temperature in Celsius:");
double celsius=sc.nextDouble();
double Fahrenheit=(celsius * 9/5) + 32;
Boolean isHot=Fahrenheit>100;
System.out.println("Celsius: "+celsius+"C\nFahrenheit: "+Fahrenheit+"F");
System.out.println("Is it hot(>100F)?"+isHot);
}
}
