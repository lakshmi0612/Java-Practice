package Inheritance;

public class Inheritance2 extends Inheritance0 {
    double weight;

    public Inheritance2(){
        this.weight=-1;
    }

    public Inheritance2(Inheritance2 Other){
        super(Other);
        weight =Other.weight;
    }
    public Inheritance2(double l, double w, double h, double weight){
        super(l,h,w); //calls the parent class constructor
        // Use to initialize values present in parent class
        this.weight=weight;

    }

}
