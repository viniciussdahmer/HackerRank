import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                long n = scan.nextLong();
                System.out.println(n + " can be fitted in:");
                // byte
                if (-Math.pow(2, 7) <= n && n <= Math.pow(2, 7) - 1) {
                    System.out.println("* byte");
                }
                // short
                if (-Math.pow(2, 15) <= n && n <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                // int
                if (-Math.pow(2, 31) <= n && n <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                // long
                System.out.println("* long");
            } catch(Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }
}
