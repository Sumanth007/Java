package classWork.Assignments.opps.google;

public class DriverClass {
    public DriverClass(String name, String number) {
        Docs obj = new Docs();
        obj.create(name, number);
    }

    public static void main(String[] args) {
        try{
            Docs obj = new Docs();
            Google obj1 = new Google();
            Integer a = 10;
            int b = a;
            obj.create("Sumanth", "12345678");
            obj.login("Sumanth", "12345678");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
