import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int n = scan.nextInt();
        scan.nextLine(); // gets the newline character
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            map.put(name, phone);
            scan.nextLine(); // gets the newline character
        }

        while (scan.hasNext()) {
            String name = scan.nextLine();
            if (map.containsKey(name)) {
                System.out.println(name + "=" + map.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
