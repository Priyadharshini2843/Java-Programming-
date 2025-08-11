import java.util.Scanner;
class BMI
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double weight,height;
System.out.print(“Enter the weight(in kgs): “);
weight=sc.nextDouble();
System.out.print(“Enter the height (in metres): “);
height=sc.nex Double();
double bmi weight/(height*height);
boolean isNormal=(bmi>=18.5) && (bmi<25);
System.out.printf(“BMI: %.2f”,bmi);
System.out.println(“Is BMI Normal? “+isNormal);
}
}

