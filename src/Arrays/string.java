package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
         String a = null;
        System.out.println(a);

        String[] str = new String[4];
 
        System.out.println(str[1]);
        Scanner in = new Scanner(System.in);
        int[] intar = new int[5];
        for(int i=0;i<intar.length;i++)
        {
            intar[i] = in.nextInt();
        }

        for(int num : intar)
        {
            System.out.print(num+" ");
        }

        System.out.println(Arrays.toString(intar));
    }
}
