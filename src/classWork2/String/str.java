package classWork2.String;

public class str {
    public static void main(String[] args) {
        String a = "hey";
        String b = "nice";
        String c = "hey";

        a.concat(b);
        System.out.println(a.equals(c));

        System.out.println(a == c);
        System.out.println(a);
        System.out.println(a.concat(b));
        System.out.println(a.concat(b));

    }
}
