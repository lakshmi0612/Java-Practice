package LinearSearch;

public class FindMinNumber {
    static int MinNum(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int min=arr[0];
        for (int i=1;i<arr.length;i++){

            if (min>arr[i]){
                min=arr[i];
            }

            }

        return min;
        }

    public static void main(String[] args) {
        int[] arr= {5,1,0,3,-1};
        int a=MinNum(arr);
        System.out.println(a);
    }

    }

