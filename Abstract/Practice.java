package Abstract;

public class Practice {
    abstract static class Parent{
        abstract void Career(String Career);
    }

    static class Child extends Parent{
        void Career(String Career){
            System.out.println("My career is "+Career);
        }

    }
}
