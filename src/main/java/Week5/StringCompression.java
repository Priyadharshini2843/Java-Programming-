import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRIYADHARSHINI M (2024503501) || Week5 Program 5");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
        sc.close();
    }
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
            else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.length() < str.length() ? sb.toString():str;
    }
}
