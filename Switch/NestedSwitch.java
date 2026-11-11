package Switch;

import java.util.Scanner;
public class NestedSwitch  {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int empid=sc.nextInt();
        String dept=sc.next();

//        switch (empid){
//            case 1:
//                System.out.println("chinnu");
//                break;
//            case 2:
//                System.out.println("minnu");
//                break;
//            case 3:
//                System.out.println("ponnu");
//               switch(dept){
//                   case "IT":
//                       System.out.println("IT");
//                       break;
//                   case "AIE":
//                       System.out.println("AIE");
//                       break;
//                   default:
//                       System.out.println("No deptartment");
//                   }
//                   break;
//            default:
//                System.out.println("Enter valid id");
//               }


        // Enhanced Switch
        switch(empid){
            case 1->System.out.println("chinnu");
            case 2->System.out.println("minnu");
            case 3 -> {
                System.out.println("ponnu");
                switch (dept){
                    case "IT" -> System.out.println("IT");
                    case "AIE"-> System.out.println("AIE");
                    default -> System.out.println("No dept");
            }
            }
            default -> System.out.println("Not valid id");
        }
        }
    }

