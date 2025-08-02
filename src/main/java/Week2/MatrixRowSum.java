import java.util.Scanner;
public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] rowSums = new int[3];
           System.out.println("Priyadharshini.M (2024503501) ");
        System.out.println("Enter 3x3 matrix values:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter 3 values for row " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                rowSums[i] += matrix[i][j];
            }
        }
        System.out.println("\nRow sums:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of row " + (i + 1) + " = " + rowSums[i]);
        }
        int maxSum = rowSums[0];
        int maxRow = 0;
        for (int i = 1; i < 3; i++) {
            if (rowSums[i] > maxSum) {
                maxSum = rowSums[i];
                maxRow = i;
            }
        }

        System.out.println("\nRow " + (maxRow + 1) + " has the highest sum = " + maxSum);
        sc.close();
    }
