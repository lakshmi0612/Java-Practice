package Questions;

public class BinarySearch {
    static boolean Binaryy(int l, int h, int element, int[] arr){
        if(l>h){
            return false;
        }else {
            int mid =l + (h - l) / 2;
            if (arr[mid] == element) {
                return true;
            } else {
                if (arr[mid] > element) {
                    return(Binaryy(0, mid - 1, element, arr));
                } else {
                    return(Binaryy(l + mid + 1, h, element, arr));
                }
            }

        }

    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        if(Binaryy(0,arr.length-1, 1,arr)){
            System.out.println("yess");
        }
    }
}
