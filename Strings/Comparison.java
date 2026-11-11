package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "a";
        String b= "a";

        System.out.println(a==b);

        int [] arr={1,2,3,4,5};
        int [] brr ={1,2,3,4,5};

        System.out.println(arr==brr);

        String c = new String("abcd");
        String d = new String("abcd");
        System.out.println(c==d); // returns false since it checks whether they points towards the same reference
        System.out.println(c.equals(d)); // returns true since it compares the value of the object

        System.out.println(c.charAt(0));


    }
}
