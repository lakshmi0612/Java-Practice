package StaticRandom;

public class InnerClasses {//Outer class cant be static

//    class Test{// This is non static class. It is dependend on the outer class. We need an object for this.
    static class Test{ // This will work since it doesnt need any object.
            static String name;

            public Test(String name){
                Test.name=name; // Error Since name isnt static Check after making it static. After that it will print the value being given at last (avasanam kodutha value print cheyum.)
                //this.name=name;
            }

    }

//    static class Test{
//        String name;
//
//        public Test(String name){
//            this.name=name;
//        }
//
//    }



    public static void main(String[] args) {
        Test a=new Test("abcd");
        Test b=new Test("efgh");

        System.out.println(a.name);
        System.out.println(b.name);

    }



}
