package Section07JavaOOP.CarClasses;

public class TestClassesCar {
    public static void main(String[] args) {

        CarClasses carClasses = new CarClasses();
        carClasses.setMake("Porsche");
        carClasses.setModel("Carrera");
        carClasses.setDoors(2);
        carClasses.setConvertible(true);
        carClasses.setColor("Black");
        System.out.println("make = " + carClasses.getMake());
        System.out.println("model = " + carClasses.getModel());
        carClasses.describeCar();

        CarClasses targa = new CarClasses();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}