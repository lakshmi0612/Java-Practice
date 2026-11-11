package question;
import java.math.*;
public class NoofdigitinBaseB {
    //Gives the no of digits in binary rep
    static int Method1(int n){
        int temp = n;
        int num =0;
        while(temp > 0){
            temp =temp>>1;
            num+=1;
        }
        return num;
    }

    // Gives no of digits in any rep
    static int Method2(int n , int base){
        if(n==0) return 1;
        int count =0;
        while(n>0){
            n=n/base;
            count++;
        }
        return count;

    }
    static int Method3(int n, int base){
        int digit = (int)((Math.log(n)) / Math.log(base)) + 1;
        return digit;

    }

    public static void main(String[] args) {
        System.out.println(Method1(2));
        System.out.println(Method2(2,2));
        System.out.println(Method3(2,2));
    }

}
