package otherPrograms;

public class reverse {
    public static void main(String[] args) {
        int n = 125;
        int ans = 0;
        while(n!=0)
        {
            int temp = n % 10;
            ans = ans * 10 + temp;
            n = n/10;
        }
        System.out.println(ans);
    }
}
