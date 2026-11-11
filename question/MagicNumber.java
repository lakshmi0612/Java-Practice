package question;
import java.math.*;
public class MagicNumber {
    static int MagicNumber(int n){
        int temp = n;
        int power = 1;
        int magic = 0;
        while(temp!=0){
            int last = temp & 1;
            magic = (int)((int) magic + (last*Math.pow(5,power)));
            power+=1;
            temp = temp>>1;
        }
        return magic;
    }

    public static void main(String[] args) {
        System.out.println(MagicNumber(5));
    }
}
