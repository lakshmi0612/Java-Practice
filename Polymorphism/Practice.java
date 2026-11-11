package Polymorphism;

public class Practice {
    static class vehicle {
        static int speedValue;

        int speed(int inKmPerHour) {
            speedValue = inKmPerHour;
            return speedValue;
        }

        static int speed(int time, int distance) {
            speedValue = distance / time;
            return speedValue;
        }

    }
    static class Car extends vehicle{
        int distance;
        int time;
        int speed;

        @Override
        int speed(int speed){
            System.out.println("The Speed of the car is " +speed + "km/hr");
            return speed;

        }
        static int speed(int time, int distance) {
            speedValue = distance + time ;
            return speedValue;
        }
    }
    public static void main(String[] args){
        final int value = 32;
        Car a = new Car();
        vehicle b = new Car();
        b.speed(26);

        System.out.println(value);
        // value = value -1; Not possible
        System.out.println(Car.speed(32,60)); //Method Hiding
        System.out.println(vehicle.speed(32,60));
    }

}
