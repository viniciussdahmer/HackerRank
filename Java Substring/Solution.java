import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        int start = s.nextInt();
        int end = s.nextInt();
        System.out.print(S.substring(start, end));
    }
}