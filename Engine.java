public class Engine {
    private final int pedalSize;

    public Engine(int pedalSize) {
        this.pedalSize = pedalSize;
    }

    public int getPedalSize() {
        return pedalSize;
    }

    @Override
    public String toString() {
        return "Engine{" + "pedalSize='" + pedalSize + '\'' + '}';
    }
}
