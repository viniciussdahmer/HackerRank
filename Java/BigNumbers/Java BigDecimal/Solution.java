import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                BigDecimal a = new BigDecimal(string1);
                BigDecimal b = new BigDecimal(string2);
                // Reverse order
                return b.compareTo(a);
            }
        };
        Arrays.sort(s, 0, n, comparator);
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}          