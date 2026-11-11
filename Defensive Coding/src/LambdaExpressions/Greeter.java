package LambdaExpressions;

public class Greeter {
//    greetingFunction= () -> System.out.println("Hello World!");
//
//    doubleNumberFunction = (int a ) ->  a*2;
//
//    safeDivisionFunction = (int a, int b) -> {
//        if(b==0) return 0;
//        return a/b;
//    };
//
//    stringLengthCountFunction = (String s) -> s.length();

    public static void main(String[] args) {
        MyLambda myLambdaFunction = ()-> System.out.println("Hello World!");
        MyAdd addFunction = (int a, int b ) -> a+b;
    }
}

interface MyLambda{
    void foo();
}

interface MyAdd{
    int add(int a, int b);
}
