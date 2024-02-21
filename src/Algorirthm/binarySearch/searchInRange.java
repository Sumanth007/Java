package Algorirthm.binarySearch;

import java.util.Arrays;

public class searchInRange {
    public static void main(String[] args) {
    int[][] arr = {{5,2,3,4},
            {10,2,34,4},
            {415,1,5,1},
            {11,22}};

    int target = 1;
    int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] farr,int ftarget)
    {
        for(int i = 0;i < farr.length;i++)
        {
            for(int j = 0;j < farr[i].length;j++)
            {
                if(farr[i][j] == ftarget)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
