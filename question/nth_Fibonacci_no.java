package question;
import java.math.*;

public class nth_Fibonacci_no {
    static int Fibo(int n) {
       int nth= (int)(Math.pow((1+Math.sqrt(5))/2, n));// not correct equation
        return nth;
    }

    public static void main(String[] args) {
        System.out.println(Fibo(3));
    }

}
