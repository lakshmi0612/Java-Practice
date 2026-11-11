package LinearSearch;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {


        int[][] arr = {{1, 2, 3}, {3, 6, 54}};
        int num = 54;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(MatrixSearch(arr,num)));
    }
    static int[] MatrixSearch(int[][]arr, int num){
        if(arr.length==0){
            return new int[]{-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==num){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1};
    }
}
