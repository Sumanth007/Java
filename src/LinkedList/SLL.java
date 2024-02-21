package LinkedList;

public class SLL {

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value,Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

}
