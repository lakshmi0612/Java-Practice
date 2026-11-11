package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // Adds the ASCII values
        System.out.println("a" + "b"); //now concatenate dthe string
        System.out.println('a' + 3);
        System.out.println("a" + 3); // When an int is added with a string it is converted into its wrapper class Integer that will call toString(). So this is same as "a"+"3"
        System.out.println((char) ('a' + 3)); // typecasting 100 inti character
        System.out.println((char) ('a' + -3));
        System.out.println("Kunal"+ new ArrayList<>()); //Java automatically calls the toString() method on the ArrayList.The + operator concatenates the String "Kunal" with the String representation of the ArrayList.An empty ArrayList returns [].
        System.out.println("Lux"+new Integer(56)); // calls tostring()
        //System.out.println(new Integer(56)+ new ArrayList<>()); Error since the operator + is only defined for primitives and when any of the value is a string
        /*
        new Integer(56)+ new ArrayList<>(). This is an expression.At least one should be string and the entire result will be string
         */
        System.out.println(new Integer(56)+" "+ new ArrayList<>());

    }
}
