package Class;

import java.util.ArrayList;

public class address2 {
    public static void main(String[] args) {
        // System.out.println(find(args[0].substring(0,6))+find(args[0].substring(6,12)));
        // System.out.println((char)Integer.parseInt(args[1],2));


        String rawData = "421000BB";

        ArrayList<Integer> arr = new ArrayList<>();

//        System.out.println(Integer.parseInt("ff", 16));
//        System.out.println(Integer.parseInt("42", 16));

        for (int i = 0; i < rawData.length() - 1; i += 2) {

            String temp = rawData.substring(i, i + 2);
            int intTemp = Integer.parseInt(temp, 16);
            System.out.println(intTemp);
            System.out.println(temp);
            arr.add(intTemp);

        }

        System.out.println(arr);
    }
}
