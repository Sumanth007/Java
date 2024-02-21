package recursion;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
        System.out.println(rev(a));
    }
    static int rev(int n)
    {
        if(n==0)return 0;
        else {
            return rev(n/10)+(n%10)*len(n);
        }
    }

    static int len(int n)
    {
        int a = (int)(Math.log10(n))+1;
        return (int) Math.pow(10,a-1);
    }
}
