package classWork2;

import java.util.HashMap;

public class dict {
    public static void main(String[] args) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        dict.put(1,1);
        dict.put(2,1);
        dict.put(3,1);
        dict.put(4,1);

        System.out.println(dict.containsKey(2));
        System.out.println(dict.get(1));

        int T = 10;
        while(T --> 0){
            System.out.println("hi");
            T--;
        }

    }
}
