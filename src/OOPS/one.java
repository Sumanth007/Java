package OOPS;

public class one {
    public static void main(String[] args) {
    Studentss a1 = new Studentss();
    Studentss a2 = new Studentss();
    Studentss a3 = new Studentss();

        System.out.println(a1.rno);
        System.out.println(a1.s);
        System.out.println(a2.rno);
        System.out.println(a2.s);
        System.out.println(a3.rno);
        System.out.println(a3.s);
        System.out.println("\n");

        System.out.println(a1.getRno());
        System.out.println(a2.getRno());
        System.out.println(a3.getRno());

        System.out.println(Studentss.nextRno());
        System.out.println(Studentss.nextChar());

    std obj = new std();
        System.out.println(obj.rr + " " + obj.ss);

        Integer sa = 10;
        System.out.println(Integer.toString(sa));
    }


}
class Studentss{
    private static int sc = 0;
    private static int updater = 65;
    char s;
    int rno;

    Studentss(){
        s = (char) updater;
        rno = sc;
        sc++;
        updater++;
    }
    public int getRno(){
        return this.rno;
    }
    public static int nextRno(){
        return sc;
    }

    public static char nextChar(){
        return (char)(updater+1);
    }

}

class std{
    int rr;
    String ss;
}