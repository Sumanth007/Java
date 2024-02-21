package Algorirthm.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {-100,-1,1,-300,-21,1,3,51,1,2,1415,104218-200,2,};
        int[] result = sorting(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sorting(int[] a)
    {
        for(int i = 0;i<a.length-1;i++)
        {
            int min = i;
            for(int j = i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;

                }
            }
//            if(a[min]<a[i]) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
//            }
        }
        return a;
    }
}
