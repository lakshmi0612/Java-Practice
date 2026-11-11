package question;

public class ithBitOfGivenNumber {
    static char ithBit(int num, int index){
        String Binary="";
        if(num==0){
            Binary=Binary+0;
        }else{
            int temp=num;
            while(temp>0){
                int remainder=temp%2;
                Binary=remainder+Binary;
                temp=temp/2;
            }
        }


            return Binary.charAt(index);

    }

    public static void main(String[] args) {
        System.out.println(ithBit(26,3));
    }
}
