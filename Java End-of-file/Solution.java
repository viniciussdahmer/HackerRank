import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while (scan.hasNext()) {
            n++;
            System.out.println(n + " " + scan.nextLine());
        }
    }
}
