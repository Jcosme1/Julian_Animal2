//version 1
package inheritanceDemoV3;

public class Reptile extends Animal {

    private boolean hasScales;
    private boolean laysEggs;

//    public Reptile(){
//        super(true, 4, "Carnivore");
//    }
//
    public Reptile(){

    }
    public Reptile(boolean hasScales, boolean laysEggs){


        this.hasScales = hasScales;
        this.laysEggs = laysEggs;
        //this();
    }
//
//    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasScales, boolean laysEggs){
//
//
//        this.hasScales = hasScales;
//        this.laysEggs = laysEggs;
//
//    }
//
//    public Reptile(Animal animal){
//       // super(animal.isBeingDangerous(), animal.getNumberOfLegs(), animal.getDiet());
//
//    }


    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println(" Hiss~~~");
    }
    public String toString(){
       return "Diet:" + this.diet + " Lays eggs? "+this.laysEggs + " has scales? "+this.hasScales;
    }
//    @Override
//    public void eat(){
//        super.eat();
//        System.out.println(" Yummmy ");
//    }


}
