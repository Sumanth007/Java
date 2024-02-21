package classWork2.abstractExample;

public abstract class abs {
    int a = 10;
    int b = 20;

    abs(){
        System.out.println("Iam abs constructor");
    }
    public abstract void getA();
    public void getB(){
        System.out.println("Parent");
    }
    public static void main(String[] args) {
        abs obj = new abs() {
            @Override
            public void getA() {
                System.out.println("Hello");
            }
        };
    }
}
