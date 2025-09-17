public class MathCalculator { 
    public static double calculatePower(int base, int exponent) { 
        if (base == 0 && exponent < 0) 
            throw new IllegalArgumentException("Base 0 with negative exponent 
is invalid."); 
        else if (base < 0 && exponent < 0) 
            throw new ArithmeticException("Both base and exponent are 
negative."); 
        else if (base == 0 && exponent == 0) 
            throw new UnsupportedOperationException("Both base and 
exponent are zero."); 
        return Math.pow(base, exponent); 
    } 
 
    public static long factorial(int n) { 
        if (n < 0) 
            throw new IllegalArgumentException("n is negative."); 
        else if (n > 20) 
            throw new ArithmeticException("Factorial overflow: n>20"); 
        long result = 1; 
        for (int i = 1; i <= n; i++) 
            result *= i; 
        return result; 
    } 
 
    public static double safeDivide(double dividend, double divisor) { 
        if (divisor == 0) 
            throw new ArithmeticException("divisor is 0"); 
        else if (dividend == 0 && divisor == 0) 
            throw new IllegalArgumentException("Both dividend and divisor is 
zero."); 
        double result = dividend / divisor; 
        return result; 
    } 
    public static void main(String[] args) { 
        System.out.println("Priyadharshini M (2024503501) || WEEK8 
Program1 "); 
        try{ 
            System.out.println("Power(2,5): "+calculatePower(2,5)); 
            System.out.println("Factorial(5): "+factorial(9)); 
            System.out.println("Divide(25/0): "+safeDivide(25,0)); 
        } 
        catch(Exception e) { 
            System.out.println("Error: "+e.getMessage()); 
        } 
    } 
} 
 
 
2. Design a banking system with:
