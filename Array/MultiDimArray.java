package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
//        //int [] [] arr= new int [3][];//Adding rows is mandatory nd not columns
//        int[] [] ={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//        };
        Scanner sc= new Scanner(System.in);
        int [][] arr=new int [3][];
        System.out.println(arr.length);
        //System.out.println(arr[1].length);
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter the size of the " +i+ "th coloumn");
            int a =sc.nextInt();
            arr[i]=new int[a];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the ("+i+","+j+")th element");
                arr[i][j]=sc.nextInt();
            }
        }

//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//    }
        for(int[]a : arr){
            System.out.println(Arrays.toString(a));

            }
        }
}
