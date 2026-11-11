package Self;

public class Basics {
    public static void main(String[] args) {
        if (true) { //the down statement will only be executed if the things inside the if statement is true
            System.out.println("Hello world");
        }
        if (false){
            System.out.println("This wont be printing");
        }

        int a =10;
        if (a==10){
            System.out.println("Hiii");

        }

        int count=1;
        while(count!=5){
            System.out.println(count);
            count++;
        }

        for(int co =1;co<=5;co++){
            System.out.println(co);
        }


    }
}
