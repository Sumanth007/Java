package Algorirthm.binarySearch;

import java.util.Arrays;

public class bS {
    public static void main(String[] args) {
        int[] arr = new int[]{88,6,5,4,3,2};
        int target =88;
        int[] ans = binS(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] binS(int[]arr , int target)
    {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            boolean isAsc = arr[s] < arr[e];

            if(arr[mid] == target)return new int[]{arr[mid],mid};
            if (isAsc) {
            if (target < arr[mid]) e = mid - 1;
            else if (target > arr[mid]) s = mid + 1;
            }
            else {
                if (target > arr[mid]) e = mid - 1;
                else if (target < arr[mid]) s = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
