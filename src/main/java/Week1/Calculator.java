import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char op;
        double result = 0;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        if (op == '+')
            result = num1 + num2;
        else if (op == '-')
            result = num1 - num2;
        else if (op == '*')
            result = num1 * num2;
        else if (op == '/')
            result = num1 / num2;
        else
            System.out.println("Invalid Operator");
            System.out.println("Result: " + result);
        sc.close();
    }
}
