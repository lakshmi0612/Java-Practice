package question;
import java.math.*;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length>=1&&nums.length<=Math.pow(10,5)){
            int i=0;
            while(i<nums.length){
                if(nums[i]>=Math.pow(-10,9)&&nums[i]<=Math.pow(10,9)){
                    if(nums.length==1){
                        return false;
                    }
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[i]==nums[j]){
                            return true;
                        }

                    }

                }
                i++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        if (containsDuplicate(nums)){
            System.out.println("Duplicate");
        }
    }
}
