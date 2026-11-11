package Stack;

import java.util.Arrays;

public class ImplementationStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public ImplementationStack(){
        this(DEFAULT_SIZE);
    } //It calls another constructor of the same class

    public ImplementationStack(int size){
        this.data = new int[size];

    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }


        ptr++;
        data[ptr]= item;
        return true;
    }

    public int pop() throws StackExceptions{
        if(isEmpty()){
            System.out.println("Stack is EMPTY");
            throw new StackExceptions("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if(ptr == -1){
            throw new Exception("Stack is EMPTY");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }




}
