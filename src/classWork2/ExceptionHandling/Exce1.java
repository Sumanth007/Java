package classWork2.ExceptionHandling;

import java.io.IOError;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exce1 {
    public static void main(String[] args) throws Exception
    {
        try{

            int[] a = new int[10];
            Scanner b = new Scanner(System.in);
            a[b.nextInt()] = 10;
        }
        catch (ArithmeticException e)
            {
                System.out.println("Error is : "+e);
            }
        catch (IOError e){
            System.out.println(" Error is : " + e);
        }
        catch (InputMismatchException e){
            System.out.println("Error is : " + e);
        }
        finally {
            System.out.println("----");
        }
        System.out.println("Hello");
    }
}
