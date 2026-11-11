package LinearSearch;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int a =13;
        int b=linear(arr,a);

        if(b==-1){
            System.out.println("Element not find");
        }
        else {
            System.out.println("Element found at index "+b);
        }

    }
    static int linear(int[] arr,int a){

        if(arr.length==0){
            return -1;
        }

        for(int i =0;i< arr.length;i++){
            if (arr[i]==a){
                return i;

            }
        }
        return -1; //This line will execute if non of the above return works
    }
}
