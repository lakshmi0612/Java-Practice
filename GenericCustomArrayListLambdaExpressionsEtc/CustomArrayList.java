package GenericCustomArrayListLambdaExpressionsEtc;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // number of used elements

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) resize();
        data[size++] = num;
    }

    public int remove() {
        if (size == 0) throw new NoSuchElementException("List is empty");
        int removed = data[--size];
        data[size] = 0; // optional: clear slot for easier debugging
        shrinkIfNeeded(); // optional: reduce capacity when mostly empty
        return removed;
    }

    public int get(int index) {
        checkIndex(index);
        return data[index];
    }

    public void set(int index, int value) {
        checkIndex(index);
        data[index] = value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        // show only the used portion for clarity
        return "CustomArrayList{ data=" + Arrays.toString(Arrays.copyOf(data, size)) +
                ", size=" + size + ", capacity=" + data.length + " }";
    }

    // ======= internals =======

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        // double capacity; guard against zero length just in case
        int newCap = (data.length == 0) ? DEFAULT_SIZE : data.length * 2;
        data = Arrays.copyOf(data, newCap);
    }

    private void shrinkIfNeeded() {
        // shrink when quarter full; never below DEFAULT_SIZE
        int quarter = data.length / 4;
        if (data.length > DEFAULT_SIZE && size <= quarter) {
            int newCap = Math.max(DEFAULT_SIZE, data.length / 2);
            data = Arrays.copyOf(data, newCap);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list); // data=[3, 5, 9], size=3, capacity=10

        list.set(1, 42);
        System.out.println(list.get(1)); // 42

        list.remove();
        System.out.println(list); // data=[3, 42], size=2, capacity=10
    }
}
