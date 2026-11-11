package LinkedList.Questions;

import LinkedList.SingleLinkedListImplementation;

public class Leetcode83 extends SingleLinkedListImplementation {
    /**
     * Remove duplicates from a sorted linked list (keep one copy).
     * In-place, O(n) time, O(1) extra space.
     */
    public void removeDuplicatesSorted() {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.value == curr.next.value) {
                // skip the duplicate node
                curr.next = curr.next.next;
                size--; // maintain size if your parent tracks it
            } else {
                curr = curr.next;
            }
        }
        // fix tail
        tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    public static void main(String[] args) {
        Leetcode83 list = new Leetcode83();
        // Note: method name must match your parent; using inserLast per your code
        list.inserLast(1);
        list.inserLast(1);
        list.inserLast(1);
        list.inserLast(1);
        list.inserLast(1);
        list.inserLast(1);
        list.inserLast(1);
        list.inserLast(1);

        list.display();                 // before
        list.removeDuplicatesSorted();  // run de-dup
        list.display();                 // after
    }
}
