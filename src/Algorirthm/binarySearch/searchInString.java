package Algorirthm.binarySearch;
import java.util.Arrays;

public class searchInString {
    public static void main(String[] args) {
        String name = "sumanth";
        char target = 'u';
        System.out.println(search(name,target));
        System.out.println(name.toCharArray());
    }
    static boolean search(String str , char t)
    {
        if(str.length() == 0)
        {
            return false;
        }
        for (int i = 0;i < str.length();i++)
        {
            if(t == str.charAt(i)){
                return true;
            }
        }
        for(char c : str.toCharArray())
        {
            if(c == t)
            {
                return true;
            }
        }
        return false;
    }
}
