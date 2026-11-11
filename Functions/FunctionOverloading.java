package Functions;

public class FunctionOverloading {
    public static void main(String[] args) {

        fun(26);
        fun("flower");

        System.out.println(sum(23,26));
        System.out.println(sum(1,2,3));


    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }
    static int sum(int a ,int b){
        return a+b;
    }

    static int sum(int a , int b, int c){
        return a+b+c;
    }
}
