package Class;

import java.util.ArrayList;
import java.util.Arrays;

public class address {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int[] nums2 = {};
        double[] num3 = {10.0 , 20.0};
        char[] ch = {'a','b'};
        boolean[] bool = {false,true};
        byte[] p = {10,20};

        System.out.println(nums);
        System.out.println(nums2);
        System.out.println(num3);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(p);
        ArrayList<Integer> integ = new ArrayList<>();

        integ.add(1);
        integ.add(2);
        System.out.println(integ);
//        any address that starts with square bracket will tell it is array and next variable will tell which class it belongs to
//        float[] ff = {10,20} it is not possible because array type caste to double is not possible
        String tempTemp = new String();
//        int hexTemp = Integer.parseInt(binaryString,2);
        String temp = "0101";
        int x = Integer.parseInt(temp,2);
        System.out.println(x);

        System.out.println();
    }
}
