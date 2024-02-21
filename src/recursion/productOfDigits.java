package recursion;

import java.util.Scanner;

public class productOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int ans = pOD(n);
        System.out.println("Your Answer is : "+ ans);
    }

    static int pOD(int n)
    {
        if(len(n))return n;
        else return pOD(n/10)*(n%10);
    }

    static boolean len(int n)
    {
        return n / 10 == 0;
    }
}
