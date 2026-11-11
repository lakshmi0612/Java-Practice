package question;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberDisapperedInArray448 {
    public static int[] Disappear(int[] arr){
        int i=0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                // Swap arr[i] with arr[correctIndex]
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int [] arr={2,5,3,1,7,6,4};
        System.out.println(Arrays.toString(Disappear(arr)));

    }
}
