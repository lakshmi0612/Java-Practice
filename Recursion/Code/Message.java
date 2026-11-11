package Code;

public class Message {
    //write a function that prints hello world
    public static void message()
    {
        System.out.println("Hello World");
        message1();
    }

    public static void message1()
    {
        System.out.println("Hello World");
        message2();
    }

    public static void message2()
    {
        System.out.println("Hello World");
        message3();
    }

    public static void message3()
    {
        System.out.println("Hello World");
        message4();
    }
    public static void message4()
    {
        System.out.println("Hello World");

    }


    public static void main(String[] args) {
        //Write a program to print it 5 times
        message();

    }
}
//Here first the main fun is called.All the fun calls that happens goes into the stack memory
