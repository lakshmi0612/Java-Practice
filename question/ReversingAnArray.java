package question;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even[]={1,2,3,4,5,6};
        reverse(arr);
        reverse(even);
    }

    static void reverse(int[] arr) {
//        int size=arr.length;
//        int sum= size-1;
//        if(arr.length%2==0){
//            for(int i=0;i<size/2;i++){
//
//                    int temp=arr[i];
//                    arr[i]=arr[sum];
//                    arr[sum]=temp;
//                    sum=sum-1;
//
//                }
//            }
//        for(int i=0;i<=size/2;i++){
//            if(i==size/2){
//                break;
//            }
//            int temp=arr[i];
//            arr[i]=arr[sum];
//            arr[sum]=temp;
//            sum=sum-1;
//        }
//        System.out.println(Arrays.toString(arr));
//    }             /////////////Inefficient Logic////////////////

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}



