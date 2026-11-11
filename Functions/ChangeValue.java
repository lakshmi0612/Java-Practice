package Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Create Array to show when functions changes the value of the array, original value is changed
        int[] arr={1,3,4,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
