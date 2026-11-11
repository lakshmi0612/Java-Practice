package Polymorphism;

public class Circle extends Shapes{
    @Override //used for checking
    void area(){
        System.out.println("I am in Circle");
    }

    int a=10 ;
    //@Override Cant override static methods
    static void greetings(){
        System.out.println("Cirlcleeee");
    }

    public static void main(String[] args) {
        Shapes a =new Circle();
        System.out.println(a.a); // No polymorphism here. The output will be 11 since Variable access is determined at compile time, based on the reference type, not the object type.
    }
}
