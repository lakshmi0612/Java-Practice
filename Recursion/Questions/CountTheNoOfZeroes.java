package Questions;

public class CountTheNoOfZeroes {
    static int countno(int n){
        int count = 0;
        if(n%10 == n ){
            if(n==0){
                count+=1;
            }
            return count;
        }else{
            if(n%10==0){
                count+=1;
            }
            return count + countno(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(countno(0));
    }
}
