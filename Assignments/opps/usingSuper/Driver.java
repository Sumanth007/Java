package classWork.Assignments.opps.usingSuper;

import classWork.Assignments.opps.google.DriverClass;

public class Driver{

    public static void main(String[] args) {
        child obj = new child(10,"Sumanth",6,8);

        obj.hello();
        obj.display();

        DriverClass obj2 = new DriverClass("Sumanth","1234141588");

    }
}