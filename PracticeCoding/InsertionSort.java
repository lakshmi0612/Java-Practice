package PracticeCoding;

import java.util.Arrays;

public class InsertionSort {
    static int[] insertion(int[] a){

        for(int i = 1; i< a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > a[j + 1]) {
                a[j + 1] = a[j];
                a[j] = key;
                key = a[j];
                j--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {12,11,13,5,6};
        System.out.println(Arrays.toString(insertion(a)));
    }
}
