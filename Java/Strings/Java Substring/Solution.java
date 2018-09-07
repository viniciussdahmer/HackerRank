import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println(s.substring(start, end));
    }
}