import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().length() == 0 || s.trim().length() > 4 * Math.pow(10, 5)) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.trim().split("[ !,?.\\_'@]+");
        System.out.println(tokens.length);
        for (String string : tokens) {
            System.out.println(string);
        }
        scan.close();
    }
}