package question;

public class FindOddOeEvenUsingAND {
    static int OddOrEven(int n){
        if(((n & 1)==1)){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(OddOrEven(1666666));
    }
}
