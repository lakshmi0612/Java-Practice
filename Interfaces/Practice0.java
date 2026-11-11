package Interfaces;

public class Practice0 implements Practice{
    @Override
    public void makeSound(String Sound){ //we have to explicitly discribe the access modifer because by default it will be default
        System.out.println("Hii");

    }

    public static void main(String[] args) {
        Practice0 first = new Practice0();
        System.out.println(Practice0.a); //first.a is not valid since a is static
        // Practice0.a = 3; Not possible since a is final

        Practice second = new Practice0(); //possible but second wont be able to access the variables
        second.makeSound("hii"); //overriding

    }

}
