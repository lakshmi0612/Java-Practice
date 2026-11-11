package PatternPrinting;

public class Intermediate {
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pyInv(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n / 2; i++) {

            diaUp(i, n / 2);
            System.out.println();
        }
        for (int j = (n / 2) + 1; j > 0; j--) {
            diaDown(j, (n / 2) + 1);
            System.out.println();
        }
    }


    private static void diaUp(int i, int n) {
        for (int j = 0; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
            System.out.print("*");
        }

    }

    private static void diaDown(int i, int n) {
        for (int j = 0; j <n - i; j++) {
            System.out.print(" ");

        }
        for (int k = 0; k < 2 * i - 1; k++) {
            System.out.print("*");
        }
    }

    public static void hollowSquare(int n){
        for(int i = 1; i<=n; i++){

                if (i== 1 || i == n) {
                    for(int b= 1; b<=n; b++) {
                        System.out.print("*");
                    }

                } else {
                    System.out.print("*");
                    for(int j = 0; j< n-2;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");

                }

            System.out.println();
        }
    }

    public static void hollowtriangle(int n){
        System.out.println("*");
        int s =n;
        for(int i =2; i<n ; i++){
            System.out.print("*");

            for(int j = 0; j<n-s; j++) {

                System.out.print(" ");

            }
            System.out.println("*");
            s--;

        }
        for(int k = 0; k<n; k++){
            System.out.print("*");

        }
    }

    public static void Floyds(int n){
        int up =1;
        for(int i = 1; i<= n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(up+" ");
                up++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyds(4);
    }
}

