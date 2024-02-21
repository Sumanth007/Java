package String;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        String name  = "Sumanth";
        System.out.println(name);

        String name1 = "Sumanth";

        if(name == name1)
        {
            System.out.println(true);
        }

        String a = new String("sam");
        String b = new String("sam");

        if(a == b)
        {
            System.out.println(false);
        }
        System.out.println();

        String[] sArr = {"aa","bb","cc","dd"};
        sArr[0] = "new";
        System.out.println(Arrays.toString(sArr));
        System.out.println(a.charAt(0));

        System.out.println(a.equals(b));

        char[]  aaa = {1,2,3,4};

    }
}
