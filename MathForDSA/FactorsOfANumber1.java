package MathForDSA;
import java.util.ArrayList;

public class FactorsOfANumber1 {

    // O(n)
    static void factorals(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //O(sqrt(n)
    static void factorals2(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " "+ n/i+ " ");
                }
            }
        }
    }

    // Both time nd space will be square root of n
    static void factorals3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        factorals(20);
        System.out.println();
        factorals2(20);
        System.out.println();
        factorals3(20);
    }
}
