package question;

public class Armstrong {
    public static void main(String[] args) {
        //arm(10);
        for(int i=100;i<=1000;i++){
            arm(i);
        }
    }
    static void arm(int a){
        int val=0;
        int original=a;
        while(original!=0){

            original=original/10;
            val+=1;
        }
        double armstrong=0;
        int temp=a;
        while(temp!=0){
            int no=temp%10;
            temp=temp/10;
            armstrong+=Math.pow(no,val);
        }
        if(a==armstrong){
            System.out.println(a+ " Is an Armstrong number");
        }
        else {
            System.out.println(a+ " Not an Armstrong number");
        }

    }
}
