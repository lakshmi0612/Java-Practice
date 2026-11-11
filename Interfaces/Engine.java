package Interfaces;

public interface Engine {
    static final int price= 78; // static and final is blurred because its by default static and final so no need to define exclusively.
    void start();
    void stop();
    void accelerate();
}
