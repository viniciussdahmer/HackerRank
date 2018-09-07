import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        // Sums the lengths of A + B strings
        System.out.println(A.length() + B.length());
        // Determines if A is lexicographically larger than B
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        // Capitalizes the first letter of each string
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));

        scan.close();
    }
}