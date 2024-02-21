package classWork2.ExceptionHandling.stackTrace;

public class e1 {
    public static void main(String[] args) {
        try {
            hello();
        } catch (ArithmeticException e) {
//                e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.toString());

            System.out.println(e.getMessage());
        }
        System.out.println("Hello");
    }

    public static void hello() {
        hey();
    }

    public static void hey() {
        System.out.println(10 / 0);
    }
}
