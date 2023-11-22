package classWork.Assignments.opps.usingSuper;

public class Driver extends child{

    Driver(int age, String name, int p, int count) {
        super(age, name, p, count);
    }

    public static void main(String[] args) {
        child obj = new child(10,"Sumanth",6,8);

    }
}
