package Stack;
import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(26);
        stack.push(23);

        stack.pop();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(7);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(89);
        deque.addLast(67);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);


    }
}
