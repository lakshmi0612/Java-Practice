package BubbleSort;

import java.util.Arrays;

public class BubbleSortCode {
    public static int[] Bubble2(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if (arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }

    //    public static int[] Bubble(int [] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            boolean Swapped = false;
//
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    Swapped=true;
//                }
//            }
//            if (!Swapped) break;
//        }
//        return arr;
//    }
//
//
//
    public static void main(String[] args) {
        int [] arr={2,-1,-65,0,2,2};
//        System.out.println(Arrays.toString(Bubble(arr)));
        System.out.println(Arrays.toString(Bubble2(arr)));
    }
}

