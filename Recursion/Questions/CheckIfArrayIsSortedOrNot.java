package Questions;

public class CheckIfArrayIsSortedOrNot {
    static boolean IsSorted(int[] arr){
        return helper(arr, 0);
    }
    static boolean helper(int arr[], int index){
        if(index== arr.length-1){
            return true;
        }else{
           return arr[index]<arr[index+1] && helper(arr, index+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4, 3,5};
        System.out.println(IsSorted(arr));
    }
}
