package LargeNumbers;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDeci {
    static void BD(){
        double x = 0.03;
        double y = 0.04;
        double ans = y -x;
        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal Ans = Y.subtract(X);
        System.out.println(Ans);




    }

    public static void main(String[] args) {
        BD();
        //Constants
        BigDecimal con = BigDecimal.ONE;
    }
}
