package Code;

public class Numbers2 {
    public static void main(String[] args) {
        //write a fun that take in a no nd prints it
        //print first 5 numbers: 1,2,3,4,5
        print1(26);
        printR(1);
    }

    static void print1(int n) {
        System.out.println(n);
    }

    //Recursion - Call the fun itself and print the first 5 no.
    static void printR(int n) {
        if (n == 5) {
            System.out.println(5);
            return;}

        System.out.println(n);
        printR(n + 1);


    }
}
