import AccessModifiers.parent;

public class Protectedexample extends parent {
    int numA;

//    void printNum() {
//        System.out.println(this.num);  // Valid access of protected member inside subclass
//    }

    public static void main(String[] args) {
        Protectedexample obA = new Protectedexample();
        obA.num=3;  // Calls method that accesses protected member
    }
}
