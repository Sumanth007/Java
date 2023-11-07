package classWork.Assignments1;

import java.util.Scanner;

public class permutationCombination {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    }

    public static int permutation(Scanner in){
        System.out.println("Enter the n to calculate the Permutation");
        System.out.println("Enter the r");

        int n = in.nextInt();
        int r = in.nextInt();

        int permutation = factorial(n) / factorial(n-r);
        int combination = factorial(n) / (factorial(n-r) * factorial(r));

        return permutation;
    }
    public static int combination(Scanner in){
        System.out.println("Enter the n to calculate the Permutation");
        System.out.println("Enter the r");

        int n = in.nextInt();
        int r = in.nextInt();

        int combination = factorial(n) / (factorial(n-r) * factorial(r));

        return combination;
    }

    public static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        else return n * factorial(n-1);
    }

}
