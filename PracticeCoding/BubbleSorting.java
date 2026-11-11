package PracticeCoding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSorting {
    static int[] bubble(int[] a){
        int l = 0;
        for(int j = 0; j< a.length - l; j++){
            boolean swap = false;
            for(int i= 1; i< a.length-j; i++){
                if(a[i] <  a[i-1]){
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    swap = true;
                }

            }
            l++;
            if(!swap) break;
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = {1,5,2,6,3};
        System.out.println(Arrays.toString(bubble(a)));
    }
}
