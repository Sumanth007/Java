package String;
import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Sumanth Hegde";
        String h  = "Sumanth Hegde";
        String[] n1 = name.split(" ");
        System.out.println(Arrays.toString(n1));
        if(name.equals(h)) System.out.println("Correct");

    }
}
