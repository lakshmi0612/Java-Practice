package Questions;
import java.math.*;

public class ReverseANumber {
    //By Loops
    static int ReverseLoop(int n){
        int len = String.valueOf(n).length()-1;
        int power = (int) Math.pow(10,len);
        int digit = 0;
        while(n>0){
            int last = n%10;
            digit = digit + (last * power);
            power/=10;
            n/=10;
        }
        return digit;

    }

    //Recursion
    static int RevrseRecursion(int n){

        if(n%10==n){
            return n;
        }else{
            int power = String.valueOf(n).length();
            return (int)Math.pow(10,power-1) * (n%10) + RevrseRecursion(n/10);
        }
    }

    //Method2


    public static void main(String[] args) {
        System.out.println(ReverseLoop(1234));
        System.out.println(RevrseRecursion(1234));
    }

}
