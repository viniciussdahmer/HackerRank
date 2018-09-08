import java.util.Scanner;

public class Solution {
   
    static boolean isAnagram(String a, String b) {
        boolean anagram = false;
        String[] arrayOfA = new String[a.length()];
        String[] arrayOfB = new String[b.length()];

        // Tests if both strings are the sime length
        if (a.length() != b.length()) {
            anagram = false;
        } else {
            // Loads the strings into the arrays
            arrayOfA = loadArray(a);
            arrayOfB = loadArray(b);

            // Sorts both arrays
            arrayOfA = sortArray(arrayOfA);
            arrayOfB = sortArray(arrayOfB);

            // Checks if both strings are anagrams
            for (int m = 0; m < arrayOfA.length; m++) {
                if (!arrayOfA[m].equalsIgnoreCase(arrayOfB[m])) {
                    anagram = false;
                    break;
                } else {
                    anagram = true;
                }
            }
        }
        return anagram;
    }

    /**
     * Loads the array with the content from the string
     */
    private static String[] loadArray(String s) {
        String[] array = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.substring(i, i + 1);
        }

        return array;
    }

    /**
     * Sorts the array
     */
    private static String[] sortArray(String[] array) {
        String aux;

        for (int k = 0; k < array.length; k++) {
            for (int l = k + 1; l < array.length; l++) {
                if (array[k].compareToIgnoreCase(array[l]) > 0) {
                    aux = array[k];
                    array[k] = array[l];
                    array[l] = aux;
                }
            }
        }

        return array;
    }
   
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}