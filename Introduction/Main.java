package Introduction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Store 5 roll no
        int[] numbers = new int[5];


        //Store 5 names
        String[] names = new String[5];

        //Store data of 5 student including roll no, marks nd name
        /*
        We can 3 arrays for each. But there are 3 different datatypes. We need to create a data structure where every elements contains these 3 things.
        this is where class and oops comes.
         */
//        Student Chinnu=new Student() ; // contains 3 ppties. (ie of the datatype Student). // default constructor
//        System.out.println(Chinnu); // some value
//        System.out.println(Chinnu.name); // by default if not intiated it will give us null
//        System.out.println(Chinnu.rno); // by default 0
//        System.out.println(Chinnu.marks); // by default 0.0
//        Chinnu.rno=26;
//        Chinnu.name="chinnu";
//        Chinnu.marks=100;
//        Chinnu.age=21;
//        System.out.println(Chinnu.age); // we can change default value

        // non parameterized
//        Student stu1 = new Student();
//        System.out.println(stu1.name);
//        stu1.greeting();

        // Parameterized constructor
        Student stu2=new Student("Gani",37,99.98f,30);
        stu2.greeting();
        stu2.change("Ganiiiii");
        stu2.greeting();

        Student random = new Student();
        System.out.println(random.name);

        Student one =new Student();
        Student two =one;
        System.out.println(two.age);
        one.age=100;
        System.out.println(two.age);



    }
    //create a class
    static class Student {
        int rno;
        String name;
        float marks;
        int age = 20;// default value given

        void greeting() {
            System.out.println("Hello my name is " + this.name);
        }
        void change(String newname){
            name = newname;
        }


        // we need a way to add the values of the above properties object by object
        //we need one word to access every object
        // Non Parameterized
//            Student(){
//                this.name="chinnu";
//                this.marks=99;
//                this.age=20;
//                this.rno=26;
//
//            }

        //Parameterised
        //Student arpit= new Student("Lux",23,99f,21);
        // Here this will be replaced with Lux
        Student(String name, int rno, float marks, int age) {
            this.name=name;
            this. rno=rno;
            this.marks=marks;
            this.age=age;

        }
        // Copy Constructor :  a special constructor that creates a new object by copying the fields from an existing object of the same class.
        Student(Student other){
            this.name=other.name;
            this.rno=other.rno;
            this.age=other.age;
        }

        //constructor chaining
        Student(){
            //This is how u call a constructor from another constructor
            this("Nandan",61,100,61);
        }

    }
}

