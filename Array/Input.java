package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
//        arr[0]=23;
//        arr[1]=26;
//        //System.out.println(Arrays.toString(arr));
//
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for(int num: arr){ // for every element in array, print the element
//            System.out.print(num +" "); // here um represents element of the array
//        }

        String[] stri = new String[4];

        for(int i=0;i<stri.length;i++){
            stri[i]=sc.next();
        }
        System.out.println(Arrays.toString(stri));

    }
}
