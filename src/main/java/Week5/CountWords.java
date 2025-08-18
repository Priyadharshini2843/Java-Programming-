import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRIYADHARSHINI M (2024503501) || Week5 Program 4");
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
        sc.close();
    }
}
