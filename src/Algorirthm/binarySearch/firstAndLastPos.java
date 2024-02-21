package Algorirthm.binarySearch;

import java.util.Arrays;

public class firstAndLastPos {
    public static void main(String[] args) {
        int[] ans = {-1, -1};
        int[] nums = {1,2,7,7,7,7,7,7,7,1};
        int target = 7;
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        System.out.println(Arrays.toString(ans));
    }
            static int search(int[] nums,int target,boolean findStartIndex)
            {
                int ans = -1;
                int s = 0;
                int e = nums.length-1;
                while(s<=e)
                {
                    int mid = s+(e-s)/2;

                    if(target < nums[mid]) e = mid-1;
                    else if(target > nums[mid]) s = mid+1;
                    else {
                        ans = mid;
                        if(findStartIndex)e = mid-1;
                        else s = mid+1;
                    }
                }
                return ans;

            }
}
