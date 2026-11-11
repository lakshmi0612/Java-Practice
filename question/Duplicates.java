package question;
import java.util.ArrayList;
public class Duplicates {


        public static int removeDuplicates(int[] nums) {
            ArrayList<Integer> List=new ArrayList<>();
            int i=0;
            if(nums.length==1){
                return 1;
            }
            if(List.size()==0){
                List.add(nums[0]);
            }
           while(i<nums.length){

               for(int j=0;j<List.size();j++){
                   if(nums[i]==List.get(j)){
                       j=j+1;
                   }else{
                       List.add(nums[i]);

                   }
               }
               i++;
           }
           return List.size();


        }

    public static void main(String[] args) {
        int[] arr= {1,1,2};
        System.out.println(removeDuplicates(arr));
    }

}
