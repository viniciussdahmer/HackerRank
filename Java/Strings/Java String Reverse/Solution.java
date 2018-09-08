import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        StringBuilder reverse = new StringBuilder();

        reverse.append(A);
        reverse = reverse.reverse();
        if (A.equals(reverse.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}