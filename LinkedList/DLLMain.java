package LinkedList;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkedList DoubleLinked = new DoublyLinkedList();
        DoubleLinked.insertFirst(26);
        DoubleLinked.insertFirst(23);
        DoubleLinked.insertFirst(230);
        DoubleLinked.insertFirst(11);
        DoubleLinked.insertFirst(222);
        DoubleLinked.insertFirst(233);
        DoubleLinked.insertFirst(255);
        DoubleLinked.insertFirst(277);
        DoubleLinked.display();

        DoubleLinked.insertAtAnIndex(100,6);
        DoubleLinked.display();
        DoubleLinked.insertAfterAValue(1000,11);
        DoubleLinked.display();
    }
}
