package OOPS;
import OOPS.constructorOverloading.*;

public class wrapperExample {
    public static void main(String[] args) {
        int a = 10;
        final Integer b = 45;
        System.out.println(b.byteValue());
        final int c = 30; //not mofiable
        System.out.println(b);

        A obj;
        obj = new A("sam");
//        for(int i = 0;i<1000000000;i++)//object will be destroyed
//        {
//            obj = new A("sam");
//        }
        System.out.println("hey");
        System.out.println(obj);

        int[] temp = new int[10];



        Students objs1 = new Students();
        System.out.println(objs1.rno);
    }

}
class A {
    final int a = 10;
    String name;

    A(String name) {
        System.out.println("Object Created \n");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}