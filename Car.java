public class Car {
    private static int carCounter = 0;
    private final int carId;
    private final Engine engine;

    public Car(int pedalSize) {
        this.engine = new Engine(pedalSize);
        this.carId = ++carCounter;
    }

    public int getCarId() {
        return carId;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" + "carId=" + carId + ", engine=" + engine + '}';
    }
}
