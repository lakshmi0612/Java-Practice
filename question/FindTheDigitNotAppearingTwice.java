package question;

public class FindTheDigitNotAppearingTwice {
    public static int Finding(int [] arr){

        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];

        }
        return xor;
    }

    public static void main(String[] args) {
        int [] arr ={2,3,4,1,2,1,3,6,4};
        System.out.println(Finding(arr));
    }
}
