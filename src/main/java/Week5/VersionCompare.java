public class VersionCompare {
    public static void main(String[] args) {
        String version1 = "15.10.10";
        String version2 = "14.20.50";
        int result = compareVersions(version1, version2);
        System.out.println("PRIYADHARSHINI M (2024503501) || Week5 Program 7");
        if (result > 0) {
            System.out.println(version1 + " is greater than " + version2);
        }
        else if (result < 0) {
            System.out.println(version1 + " is less than " + version2);
        }
        else {
            System.out.println(version1 + " is equal to " + version2);
        }
    }
    public static int compareVersions(String v1, String v2) {
        String[] arr1 = v1.split("\\.");
        String[] arr2 = v2.split("\\.");
        int length = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < length; i++) {
            int num1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int num2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
            if (num1 != num2) {
                return num1 - num2; // positive if v1 > v2, negative if v1 < v2
            }
        }
        return 0;
    }
}
