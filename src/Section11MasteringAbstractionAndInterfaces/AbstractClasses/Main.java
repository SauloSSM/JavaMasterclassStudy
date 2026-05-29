package Section11MasteringAbstractionAndInterfaces.AbstractClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Wolf", "Big", 75);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Shih tzu", "Small", 8));
        animals.add(new Dog("Border Collie", "Medium", 20));
        animals.add(new Fish("Pirarucu", "Humungous", 200));
        animals.add(new Fish("Tambaqui", "Medium", 30));

        animals.add(new Horse("Clydesdale", "Large", 500));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("Slow");
    }
}
