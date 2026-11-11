package LinkedList;

public class DoublyLinkedList {
    int size;
    Node head;
    Node tail;

    public void insertFirst(int value){

        Node node = new Node(value, head,null);
        if(head==null){
            head = node;
            tail = node;
        }else{
            head.prev=node;
            head = node;
        }
        size++;

    }

    public void display(){

        Node Current = head;
        System.out.print("null<-");
        while(Current!=null){
            System.out.print( Current.value + "->");
            Current = Current.next;


        }
        System.out.print("null");
        System.out.println();
    }

    public void displayReverse(){
        Node Current = tail;
        System.out.print("null<-");
        while(Current!= null){
            System.out.print(Current.value + "->");
            Current=Current.prev;
        }
        System.out.print("null");
        System.out.println();
    }
    public void inserLast(int value){
        Node newNode = new Node(value);
        if(tail== null){
            tail = newNode;
            head = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        newNode.next=null;
        tail = newNode;
        size++;

    }

    public void insertLastwithouttail(int value){
        Node newNode = new Node(value);
        if(head == null){
            head=newNode;
            return;
        }

        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        newNode.prev = current;
        current.next = newNode;
        newNode.next=null;
        size++;

    }

    public void insertAtAnIndex(int value, int index){
        if(size<index || index<0){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size-1){
            inserLast(value);
            return;
        }
        int s = 0;
        Node current = head;
        Node beyond = current.next;
        while(s<index-1){
            current = current.next;
            beyond = current.next;
            s++;
        }
        Node newNode  = new Node(value);
        newNode.prev=current;
        newNode.next=beyond;
        current.next=newNode;
        beyond.prev=newNode;
        size++;
    }

    public void insertAfterAValue(int insertingValue, int Value){
        if(size==0){
            System.out.println("Empty List");
            return;
        }
        if(size==1){
            if(head.value==Value){
                inserLast(insertingValue);
                size++;
            }else {
                System.out.println("Element not found");
            }
            return;
        }
        Node current = head;
        Node beyond = head.next;
        boolean check = false;

        while(current.value!=Value && current!=null){
            current= current.next;
            if(current==null){
                check = true;
            }else{
                beyond = current.next;
            }
        }
        if(!check){
            Node newNode = new Node(insertingValue);
            newNode.next=beyond;
            beyond.prev=newNode;
            current.next = newNode;
            newNode.prev=current;
            size++;
        }else{
            System.out.println("Element not present");
        }
    }



    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int Value){
            this.value = Value;
        }

        public Node(int Value, Node Next, Node Prev){
            this.value = Value;
            this.next = Next;
            this.prev = Prev;
        }

    }
}
