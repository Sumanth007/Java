package classWork2.abstractExample;

public class abs2 extends abs{

    @Override
    public void getA() {
        System.out.println(a);
    }

    public void getB(){
        System.out.println("hey");
    }

//    abstract public void getB(); not allowed

    public static void main(String[] args) {
//        abs2 obj = new abs2();

        abs obj1 = new abs2();

//        obj.getA();
//        obj1.getA();
        obj1.getB();

    }
}
