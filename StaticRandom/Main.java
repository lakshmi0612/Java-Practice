package StaticRandom;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22,"kunal", 1000,false);
        Human Rahul = new Human(32,"Rahul", 10000,true);
        Human Arpit = new Human(32,"Arpi",10000,true);
        System.out.println(kunal.name);
        System.out.println(Human.population);
        System.out.println(Arpit.population); //dont do this eventhough it will work


//        greeting(); //Error. we cant use this because it requires an instance. But the function that we are using it in does not depend on instance

        Main obj =new Main();
        obj.greeting(); // this will work

        Main funnnn =new Main();
        funnnn.funn(); // greeting will have funnnn as object

        greet();

    }

    // Something that is not static belongs to an object
    void greeting(){
        System.out.println("Hellooooooo");
        greet(); // this is possible
    }

    static void greet(){
        System.out.println("Hellooooooo");
        // greeting(); Not possible since we cant use a non static function inside a static function
    }

    void funn(){
        greeting();
    }

    static int a = 2;
    static int b = 4;
    //a= 8;
}
