package SelectionSortCode;

import java.util.Arrays;

public class SelectionSortCOde {
    public static int[] Selection(int[] arr) {

        int index = arr.length - 1;

        while (index > 0) {
            int index_max = 0;
            int max = 0;


            for (int i = 0; i <=index; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                    index_max = i;
                }

            }

            int temp=arr[index_max];
            arr[index_max]=arr[index];
            arr[index]=temp;
            index--;

        }
        return arr;

    }

    public static void main(String[] args) {
        int [] arr={23,7,8,1,0,67};
        System.out.println(Arrays.toString(Selection(arr)));
    }
}
