package question;

public class MissingNumber {
    public static int missingNumber(int[] nums) {

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
        int index_final=0;
        for(int n =0;n<nums.length;n++){
            if(nums[n]==n){
                index_final=n;
                continue;
            }else{
                return n;
            }
        }
        return index_final+1;

    }

    public static void main(String[] args) {
        int [] arr={0,1};
        System.out.println(missingNumber(arr));

    }
}
