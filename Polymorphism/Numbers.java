package Polymorphism;

public class Numbers {

    // COMPILE TIME POLYMORPHISM
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        // COMPILE TIME POLYMORPHISM
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(1,2,3);
    }

}
