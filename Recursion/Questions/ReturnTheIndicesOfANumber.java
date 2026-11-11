package Questions;

import java.sql.Statement;
import java.util.ArrayList;

public class ReturnTheIndicesOfANumber {
    static ArrayList Indices(int[] arr, int num){
        ArrayList<Integer> list = new ArrayList<>();
        return helper(arr, 0, num, list);
    }

    static ArrayList helper(int[] arr, int index, int num, ArrayList<Integer> list){

        if(index>arr.length-1){
            return list;

        }else{
            if(arr[index]==num){
                list.add(index);
            }
            return  helper(arr, index+1, num, list);
        }
    }

    //method2
    static ArrayList<Integer> fndAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return fndAllIndex(arr, target, index+1,list);
    }


    //method3
    static ArrayList<Integer> fndAllIndex1(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index== arr.length){
            return list;
        }

        //This will contain ansfor thta fun call only
        if(arr[index]== target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls= fndAllIndex1(arr, target, index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static void main(String[] args) {
        int[] arr ={1,4,3,4,5};
        int[] arr1 ={1,4,3,4,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(Indices(arr, 4));
        System.out.println(fndAllIndex(arr, 4, 0, list));
    }


}
