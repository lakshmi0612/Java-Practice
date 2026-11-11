package question;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        // Check whether input is prime or not
            primeno();
    }

    static void primeno(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        boolean prime;
        prime=true;
        if (a<=1){
            System.out.println("Neither prime nor concenant");
        }

        for(int i=2;i<=a/2;i++){
            if (a%i==0){
                prime =false;
                break;
            }
//            else{
//                prime=true;
//            }
        }
        if (prime==true){
            System.out.println("Is prime");

        }
        else {
            System.out.println("Not prime");
        }
    }
}
