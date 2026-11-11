package LinearSearch;

import java.sql.SQLOutput;

public class SearchInRange {
    //Searching an element in the a particular range of indices of an array

    static boolean searchrange(int[] arr, int a,int startindex,int stopindex){
        if(arr.length==0){
            return false;
        }
        for(int i=startindex;i<=stopindex;i++){
            if(arr[i]==a){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
          int[] arr;
          arr= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
          int num=4;
          boolean a=searchrange(arr,num,4,4);
        if (a) {
            System.out.println("Element present");
        }
        else {
            System.out.println("Element not present");
        }
    }
}
