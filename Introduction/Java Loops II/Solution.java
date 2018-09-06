import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            solveEquation(a, b, n);
        }
        scan.close();
    }

    /**
     * Solves the equation and prints to the system.output
     */
    private static void solveEquation (int a, int b, int n) {
        int result = a;

        for (int i = 0; i < n; i++) {
            result += Math.pow(2, i) * b;
            System.out.print(result + " ");
        }
        System.out.print("\n");
    }
}