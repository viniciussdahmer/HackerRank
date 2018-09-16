import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> arrayY = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            ArrayList<Integer> arrayX = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                arrayX.add(scan.nextInt());
            }
            arrayY.add(arrayX);
        }

        int q = scan.nextInt();
        for (int k = 0; k < q; k++) {
            int y = scan.nextInt();
            int x = scan.nextInt();

            try {
                System.out.println(arrayY.get(y - 1).get(x - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}