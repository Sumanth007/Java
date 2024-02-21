package recursion.rec1;

import java.util.Queue;
import java.util.Stack;

public class basicProb {
    static int sum = 0;
    public static void main(String[] args) {
        int rev = reverse(4821);
        int sum = 0;
        System.out.println(sum);

        Stack<Integer> s = new Stack<>();

    }
    public static int reverse(int n) {
        if (n == 0)
        {
         return n;
        }
        else
        {
            sum = sum*10 + (n%10);
            return reverse(n/10);
        }
    }
}


