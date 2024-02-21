package Functions;

import java.util.Scanner;

public class sum {
    static int x = 100;//statement 1
    public static void main(String[] args) {
        System.out.printf("Answer is : %d\n",sum2());
        System.out.println(x);
        int x = 80;
        System.out.println(x);//statement 1 is shadowed
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);

        //Scoping
        int a = 100;
        {
//          int a = 78;//Not possilbe
            a = 1000;
            int c = 10;
        }
        int c = 18;//correct
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}
