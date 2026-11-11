package LinkedList.Questions;


import LinkedList.SingleLinkedListImplementation;

public class FindingTheLengthOfCircularLinkedList extends SingleLinkedListImplementation {

    public static int size(Node head){
        if(head == null){
            return -1;
        }

        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ) break;

        }
        if(fast == null || fast.next == null){
            return -1;
        }

        int size = 0;
        Node curr = slow;
        do {
            curr = curr.next;
            size++;
        }while (curr!= fast);

        return size;

    }

    public static void main(String[] args) {

        SingleLinkedListImplementation list = new SingleLinkedListImplementation();

        SingleLinkedListImplementation.Node a = list. new Node(1); //This works because list.new Node(1) ties the node to that particular SingleLinkedListImplementation instance.
        a.next = list. new Node(2);
        a.next.next = list.new Node(3);
        System.out.println("Cycle length (List1): " + size(a));

        SingleLinkedListImplementation list2 = new SingleLinkedListImplementation();
        //list2.Node b = list2.new Node(1); // doesnt work because the compiler sees list2 as a variable (an object reference), not as a type.
        SingleLinkedListImplementation.Node b = list2.new Node(1);
        b.next = list2.new Node(2);
        b.next.next = list2.new Node(3);
        b.next.next.next = list2.new Node(4);
        b.next.next.next.next = list2.new Node(5);
        b.next.next.next.next.next = b.next.next; // 5 -> 3
        System.out.println("Cycle length (List2): " + size(b));


        // Example 3: whole list is a cycle (1 -> 2 -> back to 1)
        SingleLinkedListImplementation list3 = new SingleLinkedListImplementation();
        SingleLinkedListImplementation.Node c = list3.new Node(1);
        c.next = list3.new Node(2);
        c.next.next = c; // cycle length = 2
        System.out.println("Cycle length (List3): " + size(c));  // should print 2




    }


}
