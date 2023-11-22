package classWork.Assignments.opps.google;

public class DriverClass {
    public static void main(String[] args) {
        try{
            Docs obj = new Docs();
            obj.create("Sumanth", "12345678");
            obj.login("Sumanth", "12345678");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
