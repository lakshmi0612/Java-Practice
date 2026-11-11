package Introduction;

public class WrapperExample {
    public static void main(String[] args) {

        Integer num =new Integer(45);
        Integer num1 = 45;
        Integer num2 = 45;
        System.out.println(num==num1);// false — different objects
        System.out.println(num2==num1); // true  — both point to cached object 45

        Integer num3 = 450;
        Integer num4 = 450;
        System.out.println(num3==num4);// false — does not cache only caches  if in range -128 to 127

        int a =10;
        int b=20;
        Swap(a,b);
        System.out.println(a +" "+ b); // primitives wont be swapped because java is pass by value

        Swap(num1, num3);
        System.out.println(num +" "+ num3); // Its still not swapping because the Integer class is a final class

        int [] arr={1,2,3};
        change(arr);
        System.out.println(arr[0]);// wpnt change because arr is a new reference here

        chan(arr);
        System.out.println(arr[0]); // this will change since both the original and the copy of the reference points to the same object

//        final int bonus =2;
        //bonus =3; // we cant modify

        final A kunal=new A("raju");
        kunal.name ="other name"; // This can be done
        //kunal=new A("Ramu"); // Cant be done. Whe a non primitive is final, we cannot reassign it.

//        A obj;
//        for(int j=0;j<100000000;j++){
//            obj= new A("Random name");
//        }
    }

     static void Swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }

    static void Swap(Integer a, Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }

    static void change(int[] arr){
        arr = new int[]{99, 100, 101}; // points to a new array
    }

    static void chan(int[] arr){
        arr[0]=0;
    }

    static class A{
        final int num =10;
        String name="lux";

        public A(String name){
            System.out.println("object created");
            this.name=name;
        }

    }

    @Override
    protected void finalize() throws Throwable {
       System.out.println(" Object destroyed");
    }
}
