package OOPS.SingletonClass;

public class main {


    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance(); // both obj , obj1 ref variables are pointing to the same object
    }
}
