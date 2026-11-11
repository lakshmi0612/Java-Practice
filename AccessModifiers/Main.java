package AccessModifiers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "kunal");

        // Need to do few things
        // 1. Acces the data members
        //2. Modify the data memebers

        obj.arr[0]=2;
        System.out.println(Arrays.toString(obj.arr));

//        obj.num; // we cant access directly since it is private.
//        System.out.println(obj.num);// we cant print it as well
        //we can access it through getter and setter
        System.out.println(obj.getNum());
        obj.setNum(111);
        System.out.println(obj.getNum()); // we are not getting or setting the num directly. The getter and setter are both inside the class. so indirectly we can access them.
    }
}
