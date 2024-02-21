package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class variableLength {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
    }

    static  void  fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
