import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            BigInteger a = scan.nextBigInteger();
            BigInteger b = scan.nextBigInteger();

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        } catch(NumberFormatException e) {
            System.out.print(e);
        }
    }
}