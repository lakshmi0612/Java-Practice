package ExtendDemo;

public class Main implements B{
    @Override
    public void greet(){
        System.out.println("Helloo");
    }

    @Override
    public void fun() {
        System.out.println("HAving Funnn"); // ie we have to implemnet both the function
    }
}
