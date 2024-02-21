package OOPS.SingletonClass;


public class Singleton {
    private int roll = 0;
    private Singleton(){

    }

    private  static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
