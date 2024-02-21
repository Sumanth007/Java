package classWork2.ExceptionHandling;

public class Exce4 {
    public static void main(String[] args) {
        try{
            try{
                int b = 20/0;
            }
            catch(Exception e) {
                System.out.println("Error is b");
            }
            int a = 10/0;

        }
        catch(Exception e) {
            System.out.println("Error is a");
        }


    }
}
