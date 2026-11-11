package Functions;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //sum();
        //display();

//        String a=diz();
//        System.out.println(a);

        int multiplication = multi(23,26);
        System.out.println(multiplication);
    }
        //Q Take an input of 2 numbers and print the sum
        static void sum(){

        int num1,num2,sum;
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the First number :");
        num1=in.nextInt();
        System.out.print("Enter the Second number :");
        num2=in.nextInt();
        sum = num1+num2;
        System.out.println("The sum is "+sum);


    }

    static void display(){
        Scanner in =new Scanner(System.in);
        String dis=in.next();
        System.out.println(dis);
    }

    static String diz(){
        Scanner in =new Scanner(System.in);
        String dis=in.next();
        return dis;
    }

    // pass the value of the parameters while calling the function ie, arguments
    static int multi(int a, int b){
        int multiplication =a*b;
        return multiplication;
    }
}
