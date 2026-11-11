package LinkedList.Questions;

public class ReversingALinkedList {
    public static class Node{
        int value;
        Node next;
        public Node(int val){
            this.value = val;
        }

    }

    public static Node reversingLL(Node head){
        return reverse(null, head);

    }

    private static Node reverse(Node prev, Node current){

        if(current == null){
            return prev;
        }
            Node Next = current.next;
            current.next = prev;

        return reverse(current, Next);
    }

    private static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        a.next = new Node(1);
        a.next.next = new Node(2);
        a.next.next.next = new Node(3);
        display(a);
        a=reversingLL(a);
        display(a);

    }
}
