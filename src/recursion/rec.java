package recursion;

public class rec {
    public static void main(String[] args) {
        print(1);
    }

    static int print(int n)
    {
        if(n == 5) {
            System.out.println(5);
            return 1;
        }
       return print(n+1);
    }
}
