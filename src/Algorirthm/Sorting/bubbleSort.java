package Algorirthm.Sorting;
import java.util.Arrays;


public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {-100,-1,1,-300,-21,1,3,51,1,2,1415,104218-200,2,};
        int[] result = sorting(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sorting(int[] arr)
    {
        for(int i = 0;i<arr.length-2;i++)
        {
            for(int j = 0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
