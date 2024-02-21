package classWork2.tryy;
import java.util.*;
public class jva {

    public static void main(String[] args) {

        int[] []a,b[];
//        int[] []x,[]b; square brackets cannot be given after comma
        int[] x = new int[3];
        String s = new String();
        x[0] = 1;
        x[1] = 2;
        System.out.println(Arrays.toString(x));
        System.out.println(x.getClass().getName());
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());

        int[] aaa = new int['b'];
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Object[] arr = set.toArray();
        HashMap<Integer,Integer> dict = new HashMap<>();
    }

    public int[] respond(){
        int x[] = {1,2};
        return x;

    }
}
