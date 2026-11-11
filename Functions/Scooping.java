package Functions;

public class Scooping {
//    public static void main(String[] args) {

//        int c=20;
//        //Block Scope
//        {
//              int c=90; //already initialised outside the block in the same method (main), hence we cannot initialize again in the block. But we can change its value.
//              c=90; // Here the original value will be changed
//            int a =90;
//        }
//         System.out.println(a); // Error (a is Block Scope)

        //Function Scope
//        System.out.println(a); //Error (b is function scope)

        // Class Scope

            int size = 10;          // Instance variable
            static int count = 0;   // Static variable

            public void printSize() {
                System.out.println("Size: " + size);
                System.out.println("Count: " + count);
            }

            public static void main(String[] args) {
                Scooping box1 = new Scooping();
                Scooping box2 = new Scooping();

                box1.size = 20;
                Scooping.count = 2;

                box1.printSize(); // Size: 20, Count: 2
                box2.printSize(); // Size: 10, Count: 2 (shared)
            }
        }


//    static void change(int b){
//        b=30;
//    }

//}
