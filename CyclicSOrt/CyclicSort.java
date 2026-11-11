package CyclicSOrt;

import java.util.Arrays;

public class CyclicSort {
    public static int[] Cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            if(arr[i]==i+1){
                i++;
            }else{
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={3,1,5,2,6,4};
        System.out.println(Arrays.toString(Cyclic(arr)));
    }
}
