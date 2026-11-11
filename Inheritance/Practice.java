package Inheritance;

public class Practice {
    static class Species{
        boolean vertibrate;
        String family;

        Species(String family){
            this.family = family;
        }
        Species(boolean vertibrate){
            this.vertibrate = vertibrate;
        }

        Species(){

        }

    }

    static class Animal extends Species{
        String species;

        Animal(String species, boolean vertibrate,  String family  ){
            super(vertibrate);
            //super(family); Two constructors cant be initialized at the same time
            this.species = species;
            this.family = family;
        }
        Animal(String species){
            this.species = species;
        }
    }

    public static void main(String[] args){
        Species s = new Species("Human");
        System.out.println(s.family);

        Animal a = new Animal("Homo");
        System.out.println(a.species);

    }



}
