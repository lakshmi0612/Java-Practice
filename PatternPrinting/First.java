package PatternPrinting;

public class First {
    public static void Square(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void Rect(int n, int m){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Right(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inverted(int n){
        for(int i = n; i> 0; i--){
            for(int j = 0; j< i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void RightNo(int n) {
        for(int i = 1; i<=n; i++ ){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void RightInvNo(int n){
        for(int i = n; i>0; i--){
            for(int j = 1; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Alpha(int n){
        for(int i = 0; i < n; i++) {
            char a = 'A';
            for(int j = 0; j<=i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Alpha(3);

    }
}
