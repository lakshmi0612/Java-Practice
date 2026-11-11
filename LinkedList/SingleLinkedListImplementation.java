package LinkedList;

import java.util.LinkedList;

 public class SingleLinkedListImplementation {
    protected Node head;
    protected Node tail;

    protected int size;
    public SingleLinkedListImplementation(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size +=1;
    }
    public void inserLast(int value){

        Node node = new Node(value); //node.next == null
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;

        }
        size += 1;

    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }else if(index == size){
            inserLast(value);
            return;
        }else{
            Node newNode = new Node(value);
            int tempsize = 0;
            Node currentNode = head;
            while(tempsize<index-1){
                currentNode = currentNode.next;
                tempsize++;
            }
            Node upcoming = currentNode.next;
            currentNode.next = newNode;
            newNode.next = upcoming;

        }
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
        if(head == null){
            tail=null;
        }
    }

    public void deleteElementAtIndex(int index){
        if(size==1){
            head = null;
            tail = null;
            size--;
            return;
        }else{
            if(index == 0){
                head = head.next;
                size--;
                return;
            }
            if(index == size-1){
                DeleteLast();
                return;
            }

            int s = 0;
            Node current = head;
            Node beyond = current.next;
            while(s!=index-1){
                s++;
                current = current.next;
                beyond =current.next;

            }
            current.next = beyond.next;




        }
        size--;

    }

    public void DeleteLast() {
        if (head == null) {
            // List is already empty
            return;
        }

        if (size == 1) {
            // Only one node in the list
            head = null;
            tail = null;
            size = 0;
            return;
        }

        // More than one node
        int s = 0;
        Node current = head;
        while (s < size - 2) {
            current = current.next;
            s++;
        }
        current.next = null;
        tail = current;
        size--;
    }

    public boolean returnNode(int V){
        Node node  = head;
        for(int i = 0; i<size-1; i++){
            if(node.value==V){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //Insertion using recursion
    public void insertRec(int val, int index){
        insertRec(val, index, head);

    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;

        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp =temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    protected class Node{
        public int value;
        public Node next; //If no object is assigned to it then it will contain the value 'null'

        public Node(int v){
            this.value = v;
        }

        public Node(int value, Node next){
            this.value =value;
            this.next = next;
        }

    }

}


