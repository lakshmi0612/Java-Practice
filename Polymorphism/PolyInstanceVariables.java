package Polymorphism;
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
}

public class PolyInstanceVariables {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.x);  // Output: 10 ❗
    }
}
