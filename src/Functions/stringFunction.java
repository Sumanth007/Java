package Functions;

import java.util.Scanner;

public class stringFunction {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find out the square for :");
        int n = in.nextInt();
        System.out.println(product(n));

        Student s1 = new Student();

        Students s2 = new Students(10,89);
        System.out.println(s1);

        Students sumanth = new Students();
        sumanth.rno = 10;
        sumanth.marks = 89;

        Students sumanth_copy = new Students(sumanth);
        System.out.println(sumanth_copy.rno);

    }
    static  int product(int a){
        return a*a;
    }

}

class Student{
    int rno;
    int marks;
    Student(){
        rno = 21;
        marks = 89;
    }
}
class Students{
    int rno;
    int marks;
    Students(Students other){
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Students(){
        rno = 21;
        marks = 89;
    }
    Students(int rno,int marks){
        this.rno = 21;
        this.marks = 89;
    }
}