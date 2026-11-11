package question;

public class ConversionToBinary {
    static void ConvBinary(int n){
        String bin="";
        if(n==0){
            bin="0";
        }else{
            int temp=n;
            while(temp>0){
                int reminder=temp%2;
                bin=reminder+bin;
                temp=temp/2;
            }
        }
        System.out.println(bin);

    }

    public static void main(String[] args) {
        ConvBinary(2);
    }
}
