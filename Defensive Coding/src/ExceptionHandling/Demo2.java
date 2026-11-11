package ExceptionHandling;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        int i =5;

        if(i<10){
            throw new MyException("errorrr");
        }
    }
}

class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}