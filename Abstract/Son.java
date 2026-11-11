package Abstract;

public class Son extends Parent {
    @Override
    void Career(String name){
        System.out.println("I am a "+name);
    }

    @Override
    void Partner(String name, int age){
        System.out.println("I love" +name+ ". She is" +age+ "years old");
    }

}
