package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class UnitExerciseSolutionJava8 {
        public static void main(String[] args) {
            List<Person> people = Arrays.asList(
                    new Person("Charles","Dickens", 60),
                    new Person("Lewis","Corroll", 42),
                    new Person("Thomass","Corlyle", 51),
                    new Person("Charlotte","Bronte", 45),
                    new Person("Matthew","Arnold", 39)

            );

            //Step1: Sort list by last name
            Collections.sort(people,(p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));


            // Step 2: create a method that prints all elements in the list
            System.out.println("Printing all persons");
            performConditional(people, p -> true,p-> System.out.println(p));
            System.out.println( );

            //Create a method that prints all people with last name C=starting with C
            System.out.println("Printing all persons with last name ending with C ");
            performConditional(people,p -> p.getLastName().startsWith("C"), p-> System.out.println(p));
            System.out.println();

            System.out.println("Printing all persons with first name ending with C ");

            performConditional(people, p->p.getFirstName().startsWith("C"), p-> System.out.println(p.getFirstName()));
        }

        private static void performConditional(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
            for(Person p : people){
                if(predicate.test(p)) consumer.accept(p);
            }

        }



    }




