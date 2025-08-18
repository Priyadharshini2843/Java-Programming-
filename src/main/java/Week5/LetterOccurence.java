import java.util.Scanner;
class LetterOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRIYADHARSHINI M (2024503501) || Week5 Program 3 ");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // Convert to lowercase
        input = input.toLowerCase();
        int[] counts = new int[26]; // For letters a-z
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++;
            }
        }
        System.out.println("Letter occurrences:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) (i + 'a') + " = " + counts[i]);
            }
        }
        sc.close();
    }
}

