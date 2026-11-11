package Code;

public class RotatedBinarySearch {
    static boolean RotatedBinary(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int middle = low+(high-low)/2;
            if(arr[middle]==target){
                return true;
            }
            if(arr[low]<=arr[middle]){
                if(target>=arr[low] && target< arr[middle]){
                    high = middle-1;
                }else{
                    low = middle+1;
                }
            }else{
                if(target>= arr[middle] && target <= arr[high]){
                    low = middle+1;
                }else{
                    high = middle-1;
                }
            }
        }
        return false;
    }
}
