public class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, -2);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.subtract(c2);
        ComplexNumber product = c1.multiply(c2);
        ComplexNumber quotient = null;
        try {
            quotient = c1.divide(c2);
        } catch (ArithmeticException e) {
            System.err.println("Error during division: " + e.getMessage());
        }
        boolean isEqual = c1.equals(c2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + (quotient != null ? quotient : "undefined"));
        System.out.println("c1 equals c2: " + isEqual);
    }
}
class ComplexNumber {
    private double real;
    private double imaginary;
    private static double EPSILON = 1e-9;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber multiply(ComplexNumber other) {
        double a = this.real;
        double b = this.imaginary;
        double c = other.real;
        double d = other.imaginary;
        double newReal = a * c - b * d;
        double newImaginary = a * d + b * c;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber divide(ComplexNumber other) {
        double c = other.real;
        double d = other.imaginary;
        double denom = c * c + d * d;
        if (Math.abs(denom) < EPSILON) {
            throw new ArithmeticException("Division by zero complex number");
        }
        double a = this.real;
        double b = this.imaginary;
        double newReal = (a * c + b * d) / denom;
        double newImaginary = (b * c - a * d) / denom;
        return new ComplexNumber(newReal, newImaginary);
    }
    @Override
    public String toString() {
        String realStr = String.format("%.1f", real);
        String imagStr = String.format("%.1f", Math.abs(imaginary));
        String sign = imaginary >= 0 ? " + " : " - ";
        return realStr + sign + imagStr + "i";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // same reference
        }
        if (obj == null || !(obj instanceof ComplexNumber)) {
            return false;
        }
        ComplexNumber other = (ComplexNumber) obj;
        return Math.abs(this.real - other.real) < EPSILON
                && Math.abs(this.imaginary - other.imaginary) < EPSILON;
    }
    @Override
    public int hashCode() {
        long realBits = Double.doubleToLongBits(real);
        long imagBits = Double.doubleToLongBits(imaginary);
        int result = 17;
        result = 31 * result + (int) (realBits ^ (realBits >>> 32));
        result = 31 * result + (int) (imagBits ^ (imagBits >>> 32));
        return result;
    }
}

