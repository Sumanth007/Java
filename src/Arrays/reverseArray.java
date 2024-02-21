package Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int al = arr.length;
        for(int i = 0;i < al/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[al-1-i];
            arr[al-i-1] = temp;
        }
        int[] a = new int[2];
        int[]b = {1,2};
        a = b;
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
//        System.out.println(a[0].length);
        System.out.println(Arrays.toString(arr));
    }
}
