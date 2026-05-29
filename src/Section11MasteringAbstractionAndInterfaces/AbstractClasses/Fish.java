package Section11MasteringAbstractionAndInterfaces.AbstractClasses;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equals("Slow")) {
            System.out.println(getExplicitType() + " Lazily swimming");
        } else {
            System.out.println(getExplicitType() + " Dartling frantically");
        }
    }

    @Override
    public void makeNoise() {

        if (type.equals("Goldfish")) {
            System.out.println("Bloop ");
        } else {
            System.out.println("Blubloop ");
        }
    }
}
