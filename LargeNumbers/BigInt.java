package LargeNumbers;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(343152132);
        BigInteger C = new BigInteger("34315213244456578223355465465123"); // For working with very large numbers we have to use in this string format

        //Constants
        BigInteger D = BigInteger.ZERO;
        BigInteger E = BigInteger.ONE;

        //addition
        BigInteger s = A.add(C);

        System.out.println(s);

        //COnverting BigInt to int
        int c = B.intValue();
        System.out.println(c);

        BigInteger m = C.multiply(A);
        System.out.println(m);

        BigInteger sub = C.subtract(B);
        System.out.println(sub);

        BigInteger div = C.divide(B);
        System.out.println(div);

        BigInteger rem = C.remainder(B);
        System.out.println(rem);

        if(C.compareTo(B)<0 ){
            System.out.println("yes");
        }
    }
}
