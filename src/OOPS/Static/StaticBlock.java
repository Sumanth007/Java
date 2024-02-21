package OOPS.Static;

import java.util.Arrays;

public class StaticBlock {
    static int a = 4;
    static int b;

    static void greetings()
    {
        System.out.println("Hiii");
    }
    static{
        b = a*5;
    }
    public static final StaticBlock aa = null;

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " +StaticBlock.b);
        result obj1 = new result();
        result.hello obj2 = obj1.new hello();
        std Obj_std = new std();
        System.out.println(Obj_std.a);
        Obj_std.a = 10;
        System.out.println(Obj_std.a);
        std Obj_std2 = new std();

        System.out.println(Obj_std2.a);

        aa.greetings();


    }
}

class result{
    class hello{
        int a = 10;
    }
}
class Parent {
    final void finalMethod() {
        // Method implementation
        System.out.println("Parent");
    }
}

class Child extends Parent {
    // It is not possible to override the finalMethod() in the Child class
//    void finalMethod(){}
}
class std{
    int a;
    int b;
}