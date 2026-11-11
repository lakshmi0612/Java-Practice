package Questions;

public class SumOfDigits {
    static int SumDigits(int n){
        if(n==0){
            return 0;
        }else{
            return n%10 + SumDigits(n/10);
        }
    }

    //product of all the digits
    static int Product(int n){
        if(n==0){
            return 1;
        }else{
            return n%10 * Product(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(SumDigits(1432));
        System.out.println(Product(1432));
    }
}
