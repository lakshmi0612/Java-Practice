package StaticRandom;

public class Singleton {
   private  Singleton(){

    }

    private static Singleton instance ; //static is given here because instance object is not dependent on any object of Singleton class

   public static Singleton getInstance(){

       //Check whether only 1 obj is created
       if(instance==null){
           instance=new Singleton();
       }
       return instance;

   }
}
