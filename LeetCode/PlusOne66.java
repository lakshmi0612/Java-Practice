package LeetCode;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {

        //My method only for small integers
        int digit =0;
        int power = 0;
        int i =digits.length -1;
        while(i>=0){
            digit = digit + (int) (digits[i] * Math.pow(10,power));
            i--;
            power++;
        }
        digit = digit + 1;
        String S = String.valueOf(digit);
        int [] result = new int[S.length()];
        for(int j = 0; j<S.length(); j++){
            result[j]=S.charAt(j)-'0';
        }
        return result;

    }
    public static int[] plusOne1(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int [] newdigits = new int [digits.length + 1];
        newdigits[0]=1;

        return newdigits;

    }

    static int [] plusone2(int[] digits) {
        return Helper(digits, digits.length);
    }



    private static int[] Helper(int[] digits, int index){
            if (index < 0) {
                int[] newdigi = new int[digits.length + 1];
                newdigi[0] = 1;
                return newdigi;
            }

            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            }


            digits[index] = 0;
            return Helper(digits, index - 1);
        }



}
