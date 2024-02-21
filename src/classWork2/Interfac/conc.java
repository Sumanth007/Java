package classWork2.Interfac;

import java.util.Arrays;

public class conc implements in{

    @Override
    public int getA() {
        return in.a;
    }
    int a = 10;
    @Override
    public int getB() {
        return in.a;
    }

    public static void main(String[] args) {
    System.gc();
    Runtime obj = Runtime.getRuntime();
    obj.gc();
        System.out.println(5+10+" : Sum");
        System.out.println(" Sum is : " + (5+5));
        int a = (5 < 10) ? 10 : 20;
        System.out.println(a);
        int[] b = {1,2};
        int[] c = new int[2];
        c[0] = 1;
        c[1] = 2;

//        final var b1 = Arrays.deepEquals(b, c);
        int z = 2,l = 1,m = 2;
        System.out.println(z-++l);
    }
}
