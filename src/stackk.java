import java.util.ArrayList;
import java.util.Scanner;

public class stackk {
    static ArrayList<Integer> s = new ArrayList<>();
    static int len = 0;

    public static void push(int a){
        s.add(a);
        len++;
        System.out.println("New Item hass added");
    }

    public static void pop(){
        if (len > 0) {
            s.remove(s.get(--len));

        } else {
            System.out.println("Stack is empty , length is : " + len);
        }
    }

    public static int peek(){
        if (len > 0) {
            return s.get(len-1);
        } else {
            System.out.println("Stack is empty " + len);
            return -1; // Or any value that indicates an empty stack
        }
    }

    public static int length(){
        return len;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        stackk obj = new stackk();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        obj.pop();
        System.out.println(peek());
    }
}
