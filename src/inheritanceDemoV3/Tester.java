package inheritanceDemoV3;

public class Tester {
    public static void main(String[] args) {
        Mammal mammal1 = new Mammal();
        Animal animal1 = new Animal();
//        Mammal mammal2 = new Mammal(true, true);
        Reptile reptile1 = new Reptile();
        Reptile reptile2 = new Reptile(true, true);
        System.out.println(animal1);
        System.out.println(mammal1);
        mammal1.eat();
//        System.out.println(mammal2);
//        mammal2.makeNoise();
        System.out.println(reptile1);
        System.out.println(reptile2);
        reptile2.eat();
    }
}
