package String;

public class SB {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        for(int i = 0;i<26;i++)
        {
            char ch = (char)(i+'a');
            build = build.append(ch);
        }
        System.out.println(build);


    }

    String h = "Hello";
}
