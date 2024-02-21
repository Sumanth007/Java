package classWork2;

public class differentMethods {
    public void hello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new differentMethods().hello();
    }

    differentMethods(){
        System.out.println("Hey");
    }
}