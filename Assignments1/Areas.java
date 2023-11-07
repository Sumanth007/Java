package classWork.Assignments1;

import java.util.Scanner;
//import java.lang.Math.*;

public class Areas {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Area of the triangle : " + area(in));
        System.out.println("Volume of the cone : " + volume(in));

    }

    public static double area(Scanner in){
        System.out.println("Enter the Three Sides of the Triangle");

        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int s3 = in.nextInt();
        int s = (s1 + s2 + s3)/2;

        double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));

        return area;
    }

    public static double volume(Scanner in){
        System.out.println("Enter the height and radius of the cone");
        double height = in.nextInt();
        double radius = in.nextInt();

        return height*Math.pow(radius,2)*(1/3)*Math.PI;
    }

    public static double distance(Scanner in){
        System.out.println("To calculate the distnace , \n Enter the x1 , y1 and x2,y2");

        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        return Math.sqrt((y2-y1)*(x2-x1));
    }

}
