package OOPS.Inheritance;

public class parent {
    int a,b,c;
    parent(){
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    parent(int a , int b ,int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public static void main(String[] args) {
        parent obj = new parent(1,2,3);
        System.out.println(obj.a + " " + " " + obj.b + " " + " " + obj.c);

        String a;
    }
}
