package classWork.Assignments;

public class spiralDisplayingArray {
    public static void main(String[] args) {
        display(new int[]{1,2,3,4,5,6,7,8,9});
    }
    public static void display(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int flag = 0;
        int k = 0;
        while(i <= j)
        {
            if(flag == 0){
                k = i;
                flag = 1;
                i++;
            }else{
                k = j;
                flag = 0;
                j--;
            }
            System.out.print(arr[k]);
        }
    }
}
