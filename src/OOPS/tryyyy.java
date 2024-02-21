package OOPS;

import java.util.Arrays;

public class tryyyy {
    int a;
    int b;

    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",a));
        char[] str = {'a','b','c','d'};
        System.out.println(str);
        System.out.println(Arrays.toString(str));

        StringBuffer str2 = new StringBuffer();
        StringBuilder str3 = new StringBuilder();
        String str1 = new String();

        String b = "hello how are";
        StringBuilder bb = new StringBuilder(b);
        System.out.println(bb.substring(0,6));
        System.out.println((char)(65+32));
        char bbb = 'H';
        System.out.println(bbb);
        int aa = (int)(bbb);
        System.out.println();
        aa = aa+32;
        System.out.println((char)(aa));

        Character ch = 'A';

    }

    public static String restoreString(String s, int[] indices) {
        StringBuffer a = new StringBuffer();
        int i = 0;
        while(i<indices.length)
        {
            int k = indices[i];
            a.append(s.charAt(k));
            i++;
        }
        return a.toString();
    }
}
