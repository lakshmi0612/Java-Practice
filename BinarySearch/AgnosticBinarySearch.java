package BinarySearch;

public class AgnosticBinarySearch {
    public static boolean agnoBS(int[] arr, int target){
        boolean isAscending = arr[0]<arr[arr.length-1];
        int l = 0;
        int h= arr.length-1;
        while(l<=h){
            int middle=l+(h-l)/2;
            if(arr[middle]==target){
                return true;
            }
            if(isAscending){
                if(arr[middle]<target){
                    l=middle+1;
                }else{
                    h=middle-1;
                }
            }else{
                if(arr[middle]<target){
                    h=middle-1;
                }else{
                    l=middle+1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arrAscen={1,2,3,4,6,8,10};
        int [] arrDescen={10,9,8,7,6,5,3,1,0};
        if(agnoBS(arrDescen,7)){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found");
        }

        if(agnoBS(arrAscen,8)){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found");
        }
    }
}
