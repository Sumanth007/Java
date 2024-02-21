package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class string2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[6];
        for(int i = 0;i < str.length;i++)
        {
            str[i] = in.next();
        }
        int[] a = {1,2,3,4,5};
        String[] Str = {"hello","how"};
        String[] str2 = {"aa", "bb", "cc", "dd"};
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str2));

        for(String ele: Str)
        {
            System.out.println(str);
        }
    }
}
