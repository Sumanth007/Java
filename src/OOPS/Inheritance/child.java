package OOPS.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class child extends parent {
    int d;
    int hey = -1;
    child(int a, int b ,int c,int d){
        super(a,b,c);
        this.d = d;
    }


    public static void main(String[] args) {
        child obj = new child(1,2,3,4);
        parent P_obj = new child(10,20,30,40);
        System.out.println( obj.a + " " + obj.b + " " + obj.c + " " +obj.d);
//        System.out.println( P_obj.a + " " + P_obj.b + " " + P_obj.c); // we can't access a , b
        System.out.println(obj.d); // possible to access d

        parent c_obj = new child(1,2,3,4);
//        System.out.println(c_obj.a); because there is a is private

        System.out.println();


    }

    public static void overrideCheck(){
        System.out.println("Hey");
    }
    public void hey()
    {
        System.out.println("Hey Hello");
    }
}
