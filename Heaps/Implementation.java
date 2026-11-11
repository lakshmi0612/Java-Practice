package Heaps;
import java.util.*;

class MinHeaps{
    ArrayList<Integer> heap = new ArrayList<>();


    void insert(Integer a){

            heap.add(a);
            upheap(heap.size() - 1);
    }
    private void upheap( int index){

        if(index == 0) return;

        int child = heap.get(index);
        int parentIndex = (index-1)/2;
        int parent = heap.get(parentIndex);

        if(parent<=child){
            return;
        }

        heap.set(index, parent);
        heap.set(parentIndex, child);
        upheap(parentIndex);
    }
    int remove(){
        if (heap.size() == 0) {
            throw new NoSuchElementException("Heap is empty");
        }

        int minimum = heap.get(0);

        // Move last element to root
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        // Restore heap property
        if (heap.size() > 0) {
            downHeap(0);
        }

        return minimum;
    }
    private void downHeap(int index) {

        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // check left child
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        // check right child
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        // if heap property satisfied
        if (smallest == index) {
            return;
        }

        // swap
        int temp = heap.get(index);
        heap.set(index, heap.get(smallest));
        heap.set(smallest, temp);

        downHeap(smallest);
    }

}



public class Implementation {
    public static void main(String[] args) {
        System.out.println(9/2);
    }
}
