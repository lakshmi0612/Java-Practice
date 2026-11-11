package StringBuffer;
import LargeNumbers.Factorial;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args){
        StringBuffer buffer = new StringBuffer();
        buffer.append("WeMakeDevs");

        //Constructor 2
        StringBuffer sb2 = new StringBuffer("Lux");

        //Constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        buffer.insert(2, "Rahul");
        buffer.replace(1,5, "Kushwaha"); // not inclusive
        buffer.delete(1,5);
        buffer.reverse();

        System.out.println(buffer.capacity());
        String str = buffer.toString();
        System.out.println(str);

        Random random = new Random();
        System.out.println(random.nextFloat());
        System.out.println((char)(random.nextInt()));

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        //removing white spaces
        String Sentences = "Hi   jh   hdf";
        System.out.println(Sentences);
        System.out.println(Sentences.replaceAll("\\s", ""));

        //split
        String arr = "Kunal Aporv Rahul Snehal";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //Rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.23));

        System.out.println(Factorial.fact(32));
    }
}
