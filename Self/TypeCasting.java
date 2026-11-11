package Self;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
//        float num = in.nextFloat();
//        float num=in.nextInt(); //ie the variable read as an integer is stored as float.
//        System.out.println(num);
//            int num =(int) (67.56f);
//            float numb =(float) (67);
//            float a = 23;
//            System.out.println(a);
//            System.out.println(numb);

            // Automatic type promotion in expressions
//        int a =259;
//        byte b = (byte) (a); // result will be 259%256
//        System.out.println(b);

//        int number ='a';
//        System.out.println(number); // will print the ascii value
//        System.out.println("ഹലോ");
//        System.out.println("\uD83D\uDE42"); //java uses unicode values

        byte b= 42;
        char c='a';
        short s=1024;
        int i=5000;
        float f=5.67f;
double d=0.1234;
double result =(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+"   "+ (i/c) +"   "+ (d-s));
        System.out.println(result);

    }
}
