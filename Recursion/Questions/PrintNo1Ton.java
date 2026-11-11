package Questions;

import org.w3c.dom.ls.LSOutput;

public class PrintNo1Ton {
    static void PrintN(int i, int n){

        if(i==n){
            System.out.println(n);
            return;
        }
        System.out.println(i);
        PrintN(i+1,5);
    }
    //method 2
    static void print1Ton(int n){
        if(n ==1){
            System.out.print(1);
            return;
        }else{

            print1Ton(n-1);
            System.out.print(n);
        }
    }

    //Print oth 1ton and nto1
    static void printtwice(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printtwice(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
//        PrintN(1,5);
//        print1Ton(5);
        printtwice(5);
    }

}
