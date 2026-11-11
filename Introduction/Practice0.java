package Introduction;
import java.util.*;

public class Practice0 {
    public static class Student{
        int age;
        int rollNo;
        String name;
        float mark;

    }
    static void age(Student b){
         b.age = 22;
    }

    static void Age(Student b){
        b = new Student();
        b.age = 22;
    }

    public static class Teacher extends Student{
        int id;
        int age;
        String name;
        int experience;
    }

    public static void main(String[] args){
        Student a = new Student();

        Student b = new Teacher();
        a.age = 31;
        System.out.println(a.age);

//        age(a);
//        System.out.println(a.age); = 22

        Age(a);
        System.out.println(a.age);

        System.out.println(a);

        ArrayList<Integer> one = new ArrayList<>();
    }
}
