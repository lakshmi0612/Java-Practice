package Inheritance;

public class Inheritance0 {
    double l;
    double h;
    double w;

    Inheritance0(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    // Creating a cube
    Inheritance0(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Inheritance0(double l, double h, double w){
        this.l =l;
        this. w = w;
        this.h=h ;
    }

    Inheritance0(Inheritance0 old){
        this.l= old.l;
        this.h= old.h;
        this.w= old.w;

    }
    public void display(){
        System.out.println("Running Inheritance0");
    }
}
