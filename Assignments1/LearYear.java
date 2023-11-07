package classWork.Assignments1;

import java.util.Scanner;

public class LearYear {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);


        while(true) {
            System.out.println("Enter the Year Date");
            int year = in.nextInt();
            if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ) {
                System.out.println("It is a leap year");
            } else System.out.println("No a learp year");
        }
        }
}
