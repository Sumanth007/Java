package classWork2;

public class islandOfIsolation {
    static class LL{
        int val;
        LL next;
    }

    public static void main(String[] args) {
        LL obj1 = new LL();
        obj1.val = 10;

        LL obj2 = new LL();
        obj2.val = 20;
        obj1.next = obj2;

        obj2.next = null;

    }

}
