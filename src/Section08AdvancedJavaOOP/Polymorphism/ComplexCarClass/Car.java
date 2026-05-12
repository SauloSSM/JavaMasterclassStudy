package Section08AdvancedJavaOOP.Polymorphism.ComplexCarClass;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {

        System.out.println("Engine started...");
    }

    protected void runEngine() {

        System.out.println("Engine is running...");
    }

    public void drive() {

        System.out.println("Car -> Driving - Type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds the average: %.2f %n", avgKmPerLiter);
    }

    @Override
    public void drive() {
        super.drive();
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> Switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> Usage exceeds the average: %.2f %n", avgKmPerCharge);
    }

    @Override
    public void drive() {
        super.drive();
    }
}

class HybridCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("HybridCar -> All %d cylinders are fired up, Ready!%n", cylinders);
        System.out.printf("HybridCar -> Switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("HybridCar -> Usage exceeds the average: %.2f %n", avgKmPerLiter);
    }

    @Override
    public void drive() {
        super.drive();
    }
}