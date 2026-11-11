package BinarySearch;

public class RowColumnWiseSorted {
    //method2
    public static boolean search(int[][] arr, int target) {
        int row = 0;
        int column = arr[0].length - 1;

        while (row < arr.length && column >= 0) {
            if (arr[row][column] == target) {
                return true;
            } else if (arr[row][column] > target) {
                column--;  // move left
            } else {
                row++;     // move down
            }
        }

        return false;
    }

    //    Method 1
//    public static boolean searchmat(int[][]arr,int target){
//        if(arr.length==0){
//            return false;
//        } else if (arr.length==1&&arr[1].length==1) {
//            if(arr[0][0]==target){
//                return true;
//            }
//        } else if(arr.length==1){
//            int l=0;
//            int h= arr[0].length;
//            while (l<=h){
//                int middle=l+(h-l)/2;
//                if (arr[0][middle]==target){
//                    return true;
//                } else if (arr[0][middle]<target) {
//                    h=middle-1;
//
//                }else {
//                    l=middle+1;
//                }
//            }
//
//        }else{
//            for(int i=0;i< arr.length;i++){
//                int l=0;
//                int h= arr[i].length;
//                while (l<=h){
//                    int middle=l+(h-l)/2;
//                    if (arr[i][middle]==target){
//                        return true;
//                }else if (arr[0][middle]<target) {
//                        h=middle-1;
//
//                    }else {
//                        l=middle+1;
//                    }
//            }
//                }
//
//        }
//        return true;
//    }
//
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target =37;
        if(search(arr,target)){
            System.out.println("Present");
        }
    }
}
