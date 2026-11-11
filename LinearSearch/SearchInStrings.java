package LinearSearch;

import java.util.Scanner;

public class SearchInStrings {
    static boolean search (String s, char a){
        if(s.isEmpty()){
            return false;
        }
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)==a){
                    return true;
                }
        }
        return false;
    }

    static boolean search1 (String s, char a){
        if(s.isEmpty()){
            return false;
        }
        for(char ch: s.toCharArray()){//creates an array of elemens of the string{//for every character in my string. to char array
            if(ch==a){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String S = sc.nextLine();
        System.out.println("enter the character ");
        char a = sc.nextLine().charAt(0);
        boolean c=search(S,a);
        if (c){
           System.out.println("Element present");
        }
        else {
            System.out.println("Element Absent");
        }
    }
}
