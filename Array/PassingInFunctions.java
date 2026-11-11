package Array;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] cha){
        cha[1]=26;
    }
}
