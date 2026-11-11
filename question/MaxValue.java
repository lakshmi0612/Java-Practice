package question;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        max();
    }
    static void max(){
        System.out.println("Enter the size of array");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];
        for(int i=0;i<a;i++) {
            System.out.println("Enter the value of the arrays at "+i+ " index");
            arr[i]=sc.nextInt();
        }
        int b=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>b){
                b=arr[i];
            }

        }
        System.out.println("The largest value in the array is "+b);

        sc.close();
    }
}
