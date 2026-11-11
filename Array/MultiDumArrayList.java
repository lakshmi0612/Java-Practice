package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDumArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> li =new ArrayList<>();
        for(int i=0;i<3;i++){ //we need to initialize (with null) here inorder to add the elements in later

            li.add(new ArrayList<>());
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                li.get(i).add(sc.nextInt());
            }
            System.out.println();
        }
        System.out.println(li);
    }
}
