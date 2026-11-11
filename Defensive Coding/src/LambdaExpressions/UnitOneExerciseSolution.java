package LambdaExpressions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class UnitOneExerciseSolution {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens", 60),
                new Person("Lewis","Corroll", 42),
                new Person("Thomass","Corlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Matthew","Arnold", 39)

                );

        //Step1: Sort list by last name
        Collections.sort(people, new Comparator<Person>(){
                    @Override
                    public int compare(Person o1, Person o2){
                        return o1.getLastName().compareTo(o2.getLastName());
                    }
                });


        // Step 2: create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printAll(people);
        System.out.println( );
        //Create a method that prints all people with last name C=starting with C
        System.out.println("Printing all persons with last name ending with C ");
        printConditional(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });
        System.out.println();

        System.out.println("Printing all persons with first name ending with C ");

        printConditional(people, new Condition(){

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });
    }

    private static void printConditional(List<Person> people, Condition condition) {
        for(Person p : people){
            if(condition.test(p)) System.out.println(p);
        }

    }

    public static void printAll(List<Person> p){
        for(Person P : p){
            System.out.println(P);
        }
    }

}

interface Condition{
    boolean test(Person p);
}
