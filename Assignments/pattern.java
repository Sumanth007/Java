package classWork.Assignments;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pattern : ");
        pattern(in);
    }

    public static void pattern(Scanner in){
        System.out.println("Enter the n");
        int n = in.nextInt();

        int count = 1;
        for(int i = 1; i <= n ; i++ )
        {
            for(int j = 0; j < i ; j++)
            {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
