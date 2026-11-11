package question;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SwappingValuesInArray {
    public static void main(String[] args) {
        swap();
    }

    static void swap(){

        System.out.println("Enter the size of array ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the value at "+i+ "th index");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index numbers you need to swap");
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp =arr[b];
        arr[b]=arr[c];
        arr[c]=temp;
        System.out.println("The array after swapping is "+ Arrays.toString(arr));
    }
}
