package MathForDSA;

public class GCD_LCM {
    static int GCD(int a, int b){
        if(a==0){
            return b;
        }
        return GCD(b%a, a);
    }

    public static void main(String[] args) {
        System.out.println(GCD(4,8));
        System.out.println(LCM(4,8));
    }
    static int LCM(int a , int b){
        return a*b/GCD(a,b);
    }
}
