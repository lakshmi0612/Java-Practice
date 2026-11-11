package Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        Inheritance0 box = new Inheritance0();

        System.out.println(box.h+" "+ box.w+" "+ box.l);

        Inheritance0 box1 = new Inheritance0(4);

        System.out.println(box1.h+" "+ box1.w+" "+ box1.l);

        Inheritance0 box2 = new Inheritance0(4.6,7.8,8.9);

        System.out.println(box2.h+" "+ box2.w+" "+ box2.l);

        Inheritance0 box3 = new Inheritance0(box1);

        System.out.println(box3.h+" "+ box3.w+" "+ box3.l);

        Inheritance2 box4= new Inheritance2();
        System.out.println(box4.h+" "+ box4.w+" "+ box4.l+" "+box4.weight);

        Inheritance2 box5= new Inheritance2();
        System.out.println(box5.h+" "+ box5.w+" "+ box5.l+" "+box5.weight);

        Inheritance0 box6=new Inheritance2(2,3,4,8); //viceversa will give error since some variables in child class wont be able to initialise
        //System.out.println(box6.h+" "+ box6.w+" "+ box6.l+" "+box6.weight); //we cant access weight even though weight is initialized. Here the parent is referring the child
        /*
        There are many varibles in both parent and child classess. You are given access to variables that are in the ref type i.e  Inheritance2. Hence you should access to weight variable.
        This also means that the ones you are trying to access should be intialised. but here when the obj itself is of the type parent class, how will u call the child class. Parent class have no idea of weight. Hence, it gives error
         */

        /*
There are many variables in both parent and child classes.

You are given access to variables that are in the reference type — i.e., `Inheritance2`.

Hence, you are allowed to access `Other.weight`, because it's of the same class type.

But here's the catch:

The constructor starts by calling `super(Other);` — which means you're calling the parent class's constructor and passing `Other` to it.

However, the parent class **only knows about its own variables** — it has **no idea** what `weight` is, because `weight` exists only in the child class.

So, if you're inside the parent class constructor and you try to access `Other.weight`, you'll get a **compile-time error** because the parent class doesn't know about any `weight` field.

Now back in the child class:
After the call to `super(Other);` completes, you're in the body of the child constructor — here, it's **safe** to access `Other.weight` because:
    - `Other` is of type `Inheritance2`
    - `Inheritance2` contains the `weight` field
    - `Other` is already fully constructed when the constructor is called

But if the **object you're constructing is actually of the parent type**, and you're trying to use a constructor of the child class — this causes problems:
    - Parent objects **don’t have** the `weight` variable
    - So trying to call a child constructor from a parent object results in error
*/





    }
}
