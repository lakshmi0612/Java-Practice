package GenericCustomArrayListLambdaExpressionsEtc;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // number of used elements

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }



    public void add(T num) {
        if (isFull()) resize();
        data[size++] = num;
    }

    public T remove() {
        if (size == 0) throw new NoSuchElementException("List is empty");
        T removed = (T)(data[--size]);
        data[size] = 0; // optional: clear slot for easier debugging
        shrinkIfNeeded(); // optional: reduce capacity when mostly empty
        return removed;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public void set(int index, T value) {
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

        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;

//        // double capacity; guard against zero length just in case
//        int newCap = (data.length == 0) ? DEFAULT_SIZE : data.length * 2;
//        data = Arrays.copyOf(data, newCap);
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
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(45);
        System.out.println(list);

    }
}


