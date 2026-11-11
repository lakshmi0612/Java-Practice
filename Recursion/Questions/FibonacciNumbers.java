package Questions;

public class FibonacciNumbers {
    static int Fibo(int n){
        if(n<2){
            return n;

        }
        return Fibo(n-1)+Fibo(n-2); //This is the last statement
    }

    public static void main(String[] args) {
        System.out.println(Fibo(50));
    }
}