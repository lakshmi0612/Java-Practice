package Functions;

import java.util.Arrays;

public class VarArgs {
//    public static void main(String[] args) {
//
//        fun(1,2,3,4,5,6);
//        fun(6,3,1,5);
//
//    }
//
//    static void fun(int ...a){//internally it takes the input as an array of the defined datatype
//        System.out.print(Arrays.toString(a));
//    }
public static void main(String[] args) {
    //multiple(1,2,"Chinnuu","Lachuu"); //ordering is imp

    multiple(); // Error ka Ambiguity

}
static void multiple(int a, int b, String ...c){ //note varibale length parameter should be at last
    System.out.println(Arrays.toString(c));
}

    static void multiple(int a, int b, int ...c){ //note varibale length parameter should be at last
        System.out.println(Arrays.toString(c));
    }

}
