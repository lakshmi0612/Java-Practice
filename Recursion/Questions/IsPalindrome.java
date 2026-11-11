package Questions;
import java.math.*;
public class IsPalindrome {
    static boolean isPalindrome(int n){
        int a = pali(n);
        return a == n;
    }
    static int pali(int n){
        if(n%10 == n){
            return n;
        }else{
            int pow = String.valueOf(n).length()-1;
            return (int) Math.pow(10, pow) * (n%10) + pali(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));
    }
}
