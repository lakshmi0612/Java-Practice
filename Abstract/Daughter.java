package Abstract;

public class Daughter extends Parent{
    @Override
    void Career(String name){
        System.out.println("I am going to be a "+name);
    }

    @Override
    void Partner(String name, int age){
        System.out.println("I love" +name+ ". He is" +age+ "years old");
    }
}
