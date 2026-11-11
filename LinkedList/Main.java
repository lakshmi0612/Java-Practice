package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Java Predefined LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(26);

        SingleLinkedListImplementation LList = new SingleLinkedListImplementation();// Here the size of the linked list will be 0 and a head will be there and a tail will be there
        LList.insertFirst(26);
        LList.insertFirst(23);
        LList.insertFirst(64);
        LList.insertFirst(68);
        LList.insertFirst(95);
        LList.insertFirst(97);
        LList.inserLast(05);
        LList.insertAtIndex(03,2);
        LList.display();
        LList.deleteFirst();

        LList.display();
        LList.deleteElementAtIndex(3);
        LList.display();


        LList.DeleteLast();
        LList.display();

        System.out.println(LList.returnNode(23));
        System.out.println(LList.returnNode(200));


    }
}



