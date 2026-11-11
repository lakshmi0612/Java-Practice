package Queue;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_VALUE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_VALUE);
    }

    public boolean isFull(){
        return data.length == size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;

        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        int count = 0;

        while (count < size) {
            System.out.print(data[i] + "<-");
            i = (i + 1) % data.length;
            count++;
        }

        System.out.println("END");
    }



}
