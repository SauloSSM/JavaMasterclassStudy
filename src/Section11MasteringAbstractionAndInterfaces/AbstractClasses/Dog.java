package Section11MasteringAbstractionAndInterfaces.AbstractClasses;

public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equals("Slow")) {
            System.out.println(getExplicitType() + " Walking");
        } else {
            System.out.println(getExplicitType() + " Running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {

        if (type.equals("Wolf")) {
            System.out.println("Howling! ");
        } else {
            System.out.println("Woof! ");
        }
    }
}
