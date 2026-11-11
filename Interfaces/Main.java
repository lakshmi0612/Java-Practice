package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car=new Car();
//
//        car.start();
//        car.stop();
//        car.accelerate();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();

        car.upgradeEngibe();
        car.start();

    }
}
