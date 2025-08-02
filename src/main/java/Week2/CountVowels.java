import java.util.Scanner;

public class CountVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Priyadharshini.M (2024503501) ");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        char[] chars = input.toCharArray();
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
        
        for (char ch : chars) {
            switch (ch) {
                case 'a': 
                            aCount++;
                             break;
                case 'e': 
                           eCount++; 
                           break;
                case 'i': 
                            iCount++; 
                            break;
                case 'o': 
                            oCount++; 
                            break;
                case 'u': 
                             uCount++;
                              break;
            }
        }
        System.out.println("Vowel Frequencies:");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);

        sc.close(); 
    }
  
