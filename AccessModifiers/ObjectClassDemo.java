package AccessModifiers;

public class ObjectClassDemo {

    int num;
    float name;
    public ObjectClassDemo(int num,float name){
        this.num=num;
        this.name=name;
    }
// will go in detail in hashmap lecture
    @Override
    public int hashCode() {
        //return super.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectClassDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public static void main(String[] args) {
        ObjectClassDemo obj = new ObjectClassDemo(34, 56.8f);
        System.out.println(obj.hashCode());

        ObjectClassDemo obj1 = new ObjectClassDemo(45,78.9f);

        if(obj==obj1){ //Compare the address
            System.out.println("Lesser");
        }

        if(obj.equals(obj1)){ //Compare the content. By default compares the entire variable
            System.out.println("Lesser");
        }
    }


}
