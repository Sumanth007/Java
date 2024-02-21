package classWork2;

import java.io.IOError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class characterAddition {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the string");
            String str = in.nextLine();
            List<String> res = giveHextis(str);
            String s1 = res.get(0) + res.get(1);
            String s2 = res.get(2) + res.get(3);
            String hS1 = Integer.toHexString(Integer.parseInt(s1));
            String hS2 = Integer.toHexString(Integer.parseInt(s2));
            System.out.println(hS1 +":"+ hS2 +":::::");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
    public static List<String> giveHextis(String str){
        ArrayList<String> res = new ArrayList<>();
        int k = 0;
        String temp = "";
        for(int i = 0; i < str.length() && k < 4;i++)
        {
            if(str.charAt(i) == '.') {
                k++;
                res.add(temp);
                temp = "";
                continue;
            }
            temp += str.charAt(i);
        }
        res.add(temp);
        return res;
    }
}
