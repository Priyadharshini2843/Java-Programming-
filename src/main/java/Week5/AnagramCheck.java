import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("PRIYADHARSHINI M (2024503501) || Week5 Program 6");
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        }
        else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams.");
        }
    }
    public static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        // If lengths are not equal, can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        // Convert to char arrays and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Compare sorted arrays
        return Arrays.equals(arr1,arr2);
    }
}
