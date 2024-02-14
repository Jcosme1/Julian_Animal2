//version 2  -->  Reptile.java
//import Animal from animal folder/package.


package inheritanceDemoV2;

import animal.Animal;

public class Reptile extends Animal {

    private boolean hasScales;
    private boolean laysEggs;

//    public Reptile(){
//    }
//
//    public Reptile(boolean hasScales, boolean laysEggs){
//
//        this.hasScales = hasScales;
//        this.laysEggs = laysEggs;
//        //this();
//    }
//
//    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasScales, boolean laysEggs){
//
//        this.hasScales = hasScales;
//        this.laysEggs = laysEggs;
//
//    }
//
//    public Reptile(Animal animal){
//        // super(animal.beingDangerous,animal.numberOfLegs, animal.diet);
//        // --> but in this case, this constructor is taking Animal object.
//        // Animal is a superclass,but it is not in the same package as Reptile class.
//
//    }


    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println(" Hiss~~~");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" Eat anything.  ");
    }


}
