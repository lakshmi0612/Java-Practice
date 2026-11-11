package LinkedList.Questions;

public class RevLinkedListIterative {

    public static class Node{
        int value;
        Node Next;
        public Node(int val){
            this.value = val;

        }
    }

    public static Node Reverse(Node head){
        Node temp = head;
        Node next = temp.Next;
        Node prev = null;
        while(next != null){
            temp.Next = prev;
            prev = temp;
            temp = next;
            next = temp.Next;
        }
        temp.Next = prev;
        return temp;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +" ");
            temp = temp.Next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        a.Next = new Node(1);
        a.Next.Next = new Node(2);
        a.Next.Next.Next = new Node(3);
        display(a);

        a= Reverse(a);
        display(a);


    }
}
