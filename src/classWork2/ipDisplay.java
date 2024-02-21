package classWork2;

import java.util.Arrays;
import java.util.Scanner;

public class ipDisplay {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.next();

        String subStr = str.substring(0,4);

        if(subStr.equals("0000")){
            System.out.println("It is a broadcast address");
        }

        else if(subStr.equals("1111")){
            System.out.println("It is a network address");
        }

        else {
            System.out.println("It is a Unicast address");
        }

        String subStr2 = str.substring(4,12);
//        int decimalValue = Integer.parseInt(binaryString, 2);
//        int decimalValue = Integer.parseInt(hexadecimalString, 16);
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.toBinaryString(100));

        int[] a = {1,2,3,4,5};
        Arrays.sort(a);
        final var i = Arrays.binarySearch(a, 10);


        Character ch = (char)Integer.parseInt(subStr2,2);
        System.out.println("String which is passed is : " + ch);
    }
}
