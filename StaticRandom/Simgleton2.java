package StaticRandom;

public class Simgleton2 {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance(); // All these 3 will be given the same instance object

        System.out.println(obj1);
        System.out.println(obj);
        System.out.println(obj2);

        // ALl 3 reference varibles are pointing to the same object.
    }
}
