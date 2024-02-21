package Algorirthm.binarySearch;

public class binarySeach {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,6,61,2,6,1,161,14};
        int taget = 144;
        int ans = linearSearch2(nums,taget);
        System.out.println(ans);
    }

    static boolean linearSearch3(int[] arr, int target)
    {

        for (int j : arr) {
            if (target == j) {
                return true;
            }
        }
        return false;
    }
    static int linearSearch2(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for (int j : arr) {
            if (target == j) {
                return j;
            }
        }
        return -1;
    }
    static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i = 0; i < arr.length ; i++)
        {
            if(target == arr[i])
            {
                    return i;
            }
        }
        return -1;
    }
}
