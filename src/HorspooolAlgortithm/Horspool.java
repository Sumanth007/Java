package HorspooolAlgortithm;


import java.util.Arrays;
import java.util.Scanner;

public class Horspool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sub string");
        String sub = in.next();
        System.out.println("Enter the main string");
        String main = in.next();
        char[] table = generateTable(sub);
        System.out.println(Arrays.toString(table));
        int count = stringMatch(main,sub,table);
        System.out.println(count);
    }


    public static char[] generateTable(String s){
        char[] table = new char[s.length()];
        int k = 0;
        for(int i = s.length()-1;i >= 0; i--,k++) {
            table[i] = s.charAt(k);
        }
        return table;
    }


    public static int stringMatch(String main,String sub,char[] table){
        int count = 0;
        int n = main.length();
        int m = sub.length();
        int i = m-1;
        while(i<= n-1)
        {
            int k = 0;
            while(k<=m-1 && sub.charAt(m-1-k)== main.charAt(i-k))
            {
                k = k+1;
            }
            if(k == m)
            {
                return i-m+1;
            }
                    }
        return -1;
    }


}
