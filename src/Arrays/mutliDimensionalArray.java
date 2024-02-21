package Arrays;


import java.util.Arrays;

public class mutliDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3}};

        for(int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }

        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        int[][] arr2 = {{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);

    }
}
