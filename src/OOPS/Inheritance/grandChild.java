package OOPS.Inheritance;

public class grandChild extends child{
    int age;
    int hey;

    public static void main(String[] args) {
        grandChild obj = new grandChild(1,2,3,4,20);

//        System.out.println( obj.a + " " + obj.b + " " + obj.c + " " +obj.d+ " " + obj.age);
//
//        child objChild = new child(1,2,3,4);
//
//        objChild.hey();
//
//
//        grandChild obj1 = new grandChild(1,2,3,4,1);
//        obj1.hey();

            int a = obj.hey;

    }

    grandChild(int a, int b, int c, int d,int age) {
        super(a, b, c, d);
        age  = age + 10;
        this.age = age;
        this.hey = 2;

    }

//    @Override         cannot override the static methods
//    public void overrideCheck(){
//        System.out.println("hey");
//    }

    @Override
    public void hey(){
        System.out.println("Iam in grand child");
        child obj1 = new child(10,4,6,8);
        obj1.hey();

    }
}
