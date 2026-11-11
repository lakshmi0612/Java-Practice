package Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerates");
    }

    @Override
    public void start() {
        System.out.println("Electric engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops");
    }
}
