package inheritanceDemoV3;

public class Mammal extends Animal {

    private boolean hasFur;
    private boolean giveBirth;

    public Mammal(){
        super();
    }

//    public Mammal(boolean hasFur, boolean giveBirth){
//        this.hasFur = hasFur;
//        this.giveBirth = giveBirth;
//        //this();
//    }
//
//    public Mammal(boolean beingDangerous, int numberOfLegs, String diet, boolean hasFur, boolean giveBirth){
//
//        this.hasFur = hasFur;
//        this.giveBirth = giveBirth;
//    }
//
//    public Mammal(Animal animal){
//
//    }
//
    public Mammal(Animal animal, boolean hasFur, boolean giveBirth){

        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }
//
    public Mammal(String name, boolean hasFur, boolean giveBirth){

        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    @Override
    public void makeNoise(){
        System.out.println(" Meow~~~");
    }
       public String toString(){
        return "Diet:" + this.diet + " Number of Legs: " +this.numberOfLegs;
    }
    public void eat(){
        System.out.println("Yummy ");
    }

}
