import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        // Used LinkedList because the add and remove methods are faster than the same methods to an ArrayList
        // *** On the other hand, the LinkedList will not be a good choise if you need to use a get() method, since it's way slower than the ArrayList
        LinkedList<Integer> list = new LinkedList<>(); 

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();
        for (int j = 0; j < q; j++) {
            if (scan.next().equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x, y);
            } else {
                int x = scan.nextInt();
                list.remove(x);
            }
        }
        scan.close();

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}