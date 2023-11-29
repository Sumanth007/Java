package classWork.Assignments.opps;

public class inheritance {
static class Parent{
    String s = "Sumanth Java";
}

static class child extends Parent{
    String s = "----";
    public void Main(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}

    public static void main(String[] args) {
        child obj = new child();
        obj.Main();
    }
}
