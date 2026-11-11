package BinarySearch;

public class BinarySearchCode {
    public static boolean binarysearch(int [] arr,int value){
        int l = 0;
        int h =arr.length-1;

        while(l<=h){
            int middle= (l+(h-l)/2); //because l+h may exceed the range of int in java
            if(arr[middle]==value){
                return true;
            } else if (arr[middle]<value) {
                l=middle+1;
            }else {
                h=middle-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int value=110;
        if(binarysearch(arr,value)){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found");
        }
    }
}
