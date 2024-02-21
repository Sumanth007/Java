package String;

public class performance {
    public static void main(String[] args) {
        //bad memory management is happening here
        String sereis = " ";
        for(int i = 0;i<26;i++)
        {
            char ch = (char)(i+'a');
            System.out.print(ch + " ");
            sereis = sereis + ch;
        }
        System.out.println(sereis);
        System.out.print("aa");
    }
}
