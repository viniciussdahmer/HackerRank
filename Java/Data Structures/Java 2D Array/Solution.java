import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = Integer.MIN_VALUE;

        for (int line = 0; line < 4; line++) {
            for (int column = 0; column < 4; column++) {
                int sum = 0;

                for (int linha2 = line; linha2 < line + 3; linha2++) {
                    for (int coluna2 = column; coluna2 < column + 3; coluna2++) {
                        if ((coluna2 != column || linha2 != line + 1) && (coluna2 != column + 2 || linha2 != line + 1)) {
                            sum += arr[linha2][coluna2];
                        }
                    }
                }
                if (sum > result) {
                    result = sum;
                }
            }
        }

        System.out.println(result);


        scanner.close();
    }
}
