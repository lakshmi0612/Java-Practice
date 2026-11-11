package Practice;

public class First {
    static class Car{
        String brand;
        String model;
        int year;

        Car(String brand, String model, int year){
            this.model = model;
            this.brand = brand;
            this.year = year;
        }

        void start(){
            System.out.println("Car is starting");
        }

        void stop(){
            System.out.println("Car is stopping");
        }

        void display_info(){
            System.out.println("Brand : "+brand+ "\n Model : "+model+ "\n Year : " +year);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "A10", 2026);
        car1.display_info();
    }
}
