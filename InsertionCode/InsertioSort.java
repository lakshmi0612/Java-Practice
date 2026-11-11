package InsertionCode;

import java.util.Arrays;

public class InsertioSort {
    public static int [] insertion(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={23,7,8,1,0,67};
        System.out.println(Arrays.toString(insertion(arr)));
    }
}
