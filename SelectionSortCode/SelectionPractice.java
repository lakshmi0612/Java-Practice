package SelectionSortCode;

import java.util.Arrays;

public class SelectionPractice{
    public static int[] missingNumber(int[] nums) {

    for(int i=0;i<nums.length;i++){
        int minIndex=i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]<nums[minIndex]){
                minIndex=j;
            }
        }
        int temp=nums[i];
        nums[i]=nums[minIndex];
        nums[minIndex]=temp;

    }
        return nums;

}


    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 6, 4};
        System.out.println(Arrays.toString(missingNumber(arr)));
    }
}


