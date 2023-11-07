package classWork.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class swapDigit {
    public static void main(String[] args) {

        char[] arr = {'a','b','c','d'};
        System.out.println(String.valueOf(arr));
        System.out.println(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
        usingCharArray();
        wihtoutUsingChar();
       usingCharArray();
       wihtoutUsingChar();

    }

    public static void usingCharArray()
    {
        System.out.println("Enter the number");
        int n = new Scanner(System.in).nextInt();
        String s = new String(String.valueOf(n));
        char[] arr = s.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        String str = new String(arr);
        System.out.println(str);
    }
    public static void wihtoutUsingChar(){
        System.out.println("Enter the number");
        int n = new Scanner(System.in).nextInt();

        StringBuilder str = new StringBuilder(String.valueOf(n));

        char t1 = str.charAt(0);
        char t2 = str.charAt(str.length()-1);

        str = str.replace(0,1, String.valueOf(t2));
        str = str.replace(str.length()-1,str.length(),String.valueOf(t1));

        System.out.println(str);

        Integer.toString(n);
    }
}
