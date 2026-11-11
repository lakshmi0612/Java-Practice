package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays {
    public static void main(String[] args) {

        //syntax ArrayList
        ArrayList<Integer> list = new ArrayList<>(10); //Integer is the wrapper clas eof int

        list.add(67);
        list.add(3);
        System.out.println(list);

        System.out.println(list.contains(23));

        list.set(0,26);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        //input
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> Input=new ArrayList<>();
        for(int i=0;i<5;i++){
            Input.add(sc.nextInt());

        }
        System.out.println(Input);

        //Getting elements at each index
        int a;
        a=list.get(1);//index)
    }
}
