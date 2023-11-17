package classWork.Assignments;

public class postiveFirstNegatvieSecondZeroLast {
    public static void main(String[] args) {
        display(new int[]{1,2,0,0,3,-1,-2,});
    }
    public static void display(int[] arr){
        int p = -1;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > 0){
                p++;
            }
            else if(arr[i] < 0){
                
            }
        }
    }
}
