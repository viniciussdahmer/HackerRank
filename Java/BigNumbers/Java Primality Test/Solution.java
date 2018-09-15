import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        BigInteger n = new BigInteger(input);
        if (n.isProbablePrime(1)) {
            System.out.print("prime");
        } else {
            System.out.print("not prime");
        }

    }
}