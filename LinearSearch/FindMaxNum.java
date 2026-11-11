package LinearSearch;

public class FindMaxNum {
    public static void main(String[] args) {
        int[] arr={1,45,99,3,90,100};
        System.out.println(maxnum(arr));
    }
    static int maxnum(int[] arr){
        if(arr.length==0){
            System.out.println("Give a valid array as input");
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
