import java.util.Scanner;

public class Solution {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] array;
        array = new String[s.length() - k + 1];
        
        for (int i = 0; i <= s.length() - k; i++) {
            array[i] = s.substring(i, i + k);
        }
        array = sortArray(array);
        smallest = array[0];
        largest = array[array.length - 1];

        return smallest + "\n" + largest;
    }

    /**
     * Sorts the array with the substrings
     */
    private static String[] sortArray(String[] array) {
        String aux;

        for (int j = 0; j < array.length - 1; j++) {
            for (int l = j + 1; l < array.length; l++) {
                if (array[j].compareTo(array[l]) > 0) {
                    aux = array[j];
                    array[j] = array[l];
                    array[l] = aux;
                }
            }
        }
        return array;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}