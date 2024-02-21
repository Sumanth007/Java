package classWork2;

import java.util.Arrays;

public class jaggedArray {
    public static void main(String[] args) {
        String[] x = new String[5];


//        System.out.println(x);
//        System.out.println(x[0]);
//
//        /* int[][] y = {{{1,2,3},{5,6}},{1,2}}; */
//        int[] differentMethods = {1,2,3,4,5};
//
//        int value = Arrays.binarySearch(differentMethods,4);
//        System.out.println(value);
//
//        System.out.println(sum("Hey",1,2,3,4,5,6));
        System.out.println(sum());

    }

    public static String sum(String b  , int... a){ // var args
        int sum = 0;
        for(int i = 0;i < a.length;i++) sum += a[i];
        return "Hey " + sum;
    }

    public static int sum(int ... a){
        int sum =  0;
        for(int x : a)sum += x;
        return sum;
    }

    public static int sum(int a){
        System.out.println("Iam in single");
        return a;}

//    public static int sum(){
//        return 0;
//    }
}