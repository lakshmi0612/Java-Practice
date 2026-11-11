package Inheritance;

import AccessModifiers.parent;

public class ProtectedExample1 extends parent {
    int numA;

    void printNum() {
        System.out.println(this.num);  // Valid access of protected member inside subclass
    }

    public static void main(String[] args) {
        ProtectedExample1 obB = new ProtectedExample1();
        obB.printNum();  // Calls method that accesses protected member

        System.out.println(obB.num);
    }
}
