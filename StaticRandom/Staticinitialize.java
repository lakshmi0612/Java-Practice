package StaticRandom;

//demo to show initialisation of static variables
public class Staticinitialize {

    static int a=4;
    static int b;
    //b=a*5; // Not allowed

    // will only run once when it is called once
    static {
        System.out.println("In Static Block");

        b=a*5; //b can be initialised inside a static block
    }

    public static void main(String[] args) {
        Staticinitialize obj=new Staticinitialize();
        System.out.println(a + " "+ b);

        Staticinitialize.b+=3 ;
        System.out.println(a + " "+ b); //it will be 23


    }
}
