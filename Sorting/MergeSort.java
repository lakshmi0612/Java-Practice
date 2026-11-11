package Sorting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }
    static int[] mergeSort(int[] arr){

        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] left,int[] right){
        int[] combined = new int[left.length+right.length];
        int l =0;
        int r =0;
        int index =0;
        while(l<left.length && r<right.length ){
            if(left[l]<right[r]){
                combined[index]=left[l];
                l++;
            }else{
                combined[index]= right[r];
                r++;
            }
            index++;
        }
        if(l<left.length){
            while(l<left.length){
                combined[index]=left[l];
                l++;
                index++;
            }
            return combined;
        }else if(r<right.length){
            while(r<right.length){
                combined[index]=right[r];
                r++;
                index++;
            }
            return combined;
        }else{
            return combined;
        }

    }

}
