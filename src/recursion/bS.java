package recursion;

public class bS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 8,s = 0 , e = arr.length-1;
        int ans = search(arr,target, s, e);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int s , int e)
    {
        int mid = s + (e-s)/2;
        if(s>e) return -1;
        else if(target < mid)
        {
            return search(arr,target,s,mid-1);
        }
        else if(target > mid){
            return search(arr,target,mid+1,e);
        }
        return mid;
    }
}
