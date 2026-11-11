package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name ="Latha cs";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name); //original one didnt change
        System.out.println(name.indexOf('a')); //gives the first index value
        System.out.println(name.lastIndexOf('a',2));
        System.out.println("    Lux     ".strip()); //white spaces will be removed
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
