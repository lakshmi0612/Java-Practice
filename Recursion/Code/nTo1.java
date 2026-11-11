package Code;

public class nTo1 {
    static void print1Ton(int n){
        if(n ==1){
            System.out.print(1);
            return;
        }else{
            System.out.print(n);
            print1Ton(n-1);
        }
    }

    public static void main(String[] args) {
        print1Ton(5);
    }
}
