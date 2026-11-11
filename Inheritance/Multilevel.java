package Inheritance;

public class Multilevel {
    static class A{
        int age;
        int salary;

        A(int age, int salary){
            this.age=age;
            this.salary=salary;
        } // if we are defining a constructor then we need to define constructor for the child class as well.
        // ❌ If No constructor then Java tries to call A() — a no-arg constructor — by default.
    }

    static class B extends A {
        //super(age,salary);
        String name;
        String gender;

        B(int age, int salary, String name, String gender){
            super(age,salary);
            this.name=name;
            this.gender=gender;
        }
    }

    static class C extends B{
        String Species;
        String Place;

        C(int age, int salary, String name, String gender, String Species, String Place){
            super(age, salary,name,gender); //Class B should have a constructor tht takes 4 arguments
            Species=this.Species;
            Place=this.Place;
            /*super(age, salary, name, gender) calls B's constructor.
             Which then calls A's constructor via super(age, salary) — so all constructors in the chain are triggered.
             */

        }
    }

    public static void main(String[] args) {
        // With default constructor
//        C obj0 = new C();
//        obj0.age=21;
//        System.out.println(obj0.age);

        //with parameterized constructor

        C obj1=new C(21,10000,"Nandan", "Male", "Homo Sapiens", "Iverkala");
        obj1.age=22;
        System.out.println(obj1.age);

    }
}
