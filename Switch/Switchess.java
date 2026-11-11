package Switch;

import java.util.Scanner;

public class Switchess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String fruit=sc.next();

        /*
        Syntax for switch
        switch(expression){
            case 1:
                //do something
                break;
             case 2;
                //do something
                break;
             default:
                //dp something
          }
         */

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A day keeps the doctor away");
//                break;
//            default:
//                System.out.println("another");
//        }

        //Enhanced Switch

//        switch(fruit){
//            case "Mango" -> System.out.println("King of fruits"); // No need of break;
//            case "Apple" -> System.out.println("A day keeps the doctor away");
//            default ->  System.out.println("another");
//        }
        int day = sc.nextInt();
//        switch (day){
//            case 1,2,3,4,5->System.out.println("Weekday");
//            case 6,7 ->System.out.println("weekend");
//        }


        switch (day) {
            case 1 -> {
                System.out.println("Weekday");
                System.
                        out.println("Multiline Statement");
            }
            case 6, 7 -> System.out.println("weekend");
        }
    }
}