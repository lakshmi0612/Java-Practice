package Sorting;
import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        InplacemergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));  // Final sorted array
    }

    static void InplacemergeSort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = s + (e - s) / 2;
        InplacemergeSort(arr, s, mid);
        InplacemergeSort(arr, mid, e);

        Inplacemerge(arr, s, mid, e);  // merge into original array
    }

    private static void Inplacemerge(int[] arr, int s, int m, int e) {
        int[] combined = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                combined[k++] = arr[i++];
            } else {
                combined[k++] = arr[j++];
            }
        }

        while (i < m) {
            combined[k++] = arr[i++];
        }

        while (j < e) {
            combined[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (int x = 0; x < combined.length; x++) {
            arr[s + x] = combined[x];
        }
    }
}
