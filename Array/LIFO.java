package Array;

public class LIFO {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        methodA();
        System.out.println("Main Ends");
    }
    static void methodA(){
        System.out.println("Method A Starts");
        methodB();
        System.out.println("Method A Ends");
    }
    static void methodB(){
        System.out.println("Method B Starts");
        methodC();
        System.out.println("Method B Ends");
    }
    static void methodC(){
        System.out.println("Method c Starts here");
        System.out.println("Method c ends here");
    }
    /*
|-----------------|
| methodC()      |
| methodB()      |
| methodA()      |
| main()         |
|-----------------|

     */
}
