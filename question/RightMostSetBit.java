package question;

public class RightMostSetBit {

    /**
     * Returns the mask of the right‑most set bit.
     * e.g. "1010"  →  2  (binary 10)
     *      "1000"  →  8  (binary 1000)
     *      "0000"  →  0  (no bits set)
     */
    public static int rightMostSetBit(String binary) {
        int n = Integer.parseInt(binary, 2);   // radix‑2 parse
        return (n == 0) ? 0 : (n & -n);        // isolate lowest ‘1’
    }

    public static void main(String[] args) {
        System.out.println(rightMostSetBit("1011"));   // → 2
        System.out.println(Integer.parseInt("10",2));
    }
}
