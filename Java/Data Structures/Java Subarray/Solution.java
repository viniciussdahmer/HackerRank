import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.print(numberOfNegativeSubArrays(a));
    }

    /**
     * Summs the number of negative subarrays
     */
    private static int numberOfNegativeSubArrays (int[] a) {
        int total = 0;

        // Verifies each subarray for each starting position
        // position = 0 --> subarrays = 0..0, 0..1, 0..2, 0..3, 0..4
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum < 0) {
                    total++;
                }
            }
        }

        return total;
    }
}