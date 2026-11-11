package Questions;

public class NoIsPresentOrNot {
    static boolean IsPresent(int[] arr, int num){
        return helper(arr,0,num);
    }
    static boolean helper(int[] arr, int index, int num){
        if(index==arr.length-1){
            return false;
        }else{
            return arr[index]==num || helper(arr, index+1, num);
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,32,45};
        System.out.println(IsPresent(arr, 302));
    }
}
