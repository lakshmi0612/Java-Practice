package Stack;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) throws StackExceptions {
        ImplementationStack stack1 = new ImplementationStack();
        stack1.push(26);
        stack1.push(23);
        stack1.push(1);
        stack1.push(2);
        System.out.println(Arrays.toString(stack1.data));
        System.out.println(stack1.ptr);
        System.out.println(stack1.pop());
        System.out.println(stack1.ptr);
    }
}
