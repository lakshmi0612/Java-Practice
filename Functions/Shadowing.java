package Functions;

public class Shadowing {
    static int x=90; //will be available to everything inside this class. This will be shadowed at line 7. int x= 100;
    public static void main(String[] args) {
        System.out.println(x);
        /*int x=100;*/ int x;
        //System.out.println(x); //Error since x isnt initialized yet. It is only declared

        x=100; //Here shadowing begins now ie scope will begin when the variable is initialised.
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x); //x can be used anywhere inside the class shadowing. This x will be the one with value 90. shadowing doesnt happen here
    }
}
