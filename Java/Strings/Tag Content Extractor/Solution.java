import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String pattern = "<(.+)>([^<]+)</\\1>";

		while(testCases>0){
            String line = in.nextLine();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(line);
            boolean found = false;

            while (m.find()) {
                found = true;
                System.out.println(m.group(2));
            }

            if (!found) {
                System.out.println("None");
            }
			testCases--;
		}
	}
}

