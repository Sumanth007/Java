import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class tryy
{
    public static void main (String[]args) {
//        System.out.println(arithmeticTriplets(new int[]{0,1,4,6,7,10},3));
        System.out.println((11%2));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = nums.length-1;i >= 1 ; i-- )
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            for(int j = i-1; j >= 0 ; j--)
            {
                if(nums[i]-nums[j] == diff)temp.add(j);
                System.out.println(i + " " + j + " " + temp.size());
                System.out.println(j);

                if(temp.size() == 3){
                    list.add(temp);
                    temp.clear();
                }
            }
        }
        for(List n : list)
        {
            System.out.print(n);
        }
        System.out.println(list.size());
        return list.size();
    }
}