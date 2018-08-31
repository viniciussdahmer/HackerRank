import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float result = n % 2;

        // If the number is odd
        if (result != 0) {
            System.out.print("Weird");    
        // If the number is even
        } else {
            printTheEvenResults(n);
        }
    }

    /**
     * Prints out the results from the even numbers
     */
    private static void printTheEvenResults (float number) {
        // If the number is between 2 and 5 inclusive
        if (2 < number && number <= 5) {
            System.out.print("Not Weird");
        // If the number is between 6 and 20 inclusive
        } else if (6 < number && number <= 20) {
            System.out.print("Weird");
        // If the number is greater than 20
        } else if (number > 20) {
            System.out.print("Not Weird");
        }
    }
}