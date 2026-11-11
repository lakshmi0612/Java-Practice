package question;
import java.util.Scanner;
public class ForLoopSeries {
    public static void main(String[] args) {
        /*
Series Formula:

For each query with integers a, b, and n,
the series is generated as follows:

Term 1:  a + 2^0 * b
Term 2:  a + 2^0 * b + 2^1 * b
Term 3:  a + 2^0 * b + 2^1 * b + 2^2 * b
...
Term n:  a + 2^0 * b + 2^1 * b + 2^2 * b + ... + 2^(n-1) * b
Print n such terms for each query.
*/

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if (a >= 0 && b >= 0 && a <= 50 && b <= 50 && n >= 1 && n <= 15) {
                int val = a;
                for (int j = 0; j < n; j++) {
                    val += (int) Math.pow(2, j) * b;
                    System.out.print(val + " ");
                }
                System.out.println();  // Move to next line after each query
            }
        }

        in.close();






    }
}
