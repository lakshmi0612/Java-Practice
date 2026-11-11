package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    int size =0;

    private class Node{
        int value;
        Node next;

        public Node(int V){
            this.value = V;
        }

        public Node(int V, Node N){
            this.value=V;
            this.next= N;
        }

    }

    public void display(){
        Node temp = head;
        ;
        do{
            System.out.print(temp.value + "->");
            temp = temp.next;
        }while(temp!=head);

        System.out.print("HEAD(Circular)");
        System.out.println();
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;

        }
        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!= head);
    }

    public void insertLast(int value){
        Node newNode = new Node(value, head);
        if(tail == null){
            head = newNode;
            tail = newNode;

        }

        tail.next = newNode;
        tail = newNode;
        size++;

    }

}
