package Polymorphism;

public class ObjectPrint {

    int num;
    @Override
    public String toString(){
        //System.out.println(num);
        return "num = "+num;
    }
    public ObjectPrint(int num){
       this.num=num;
    }
    public static void main(String[] args) {

        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);

    }
}
