public class Customer {
    private String fullName;
    private Car car;

    public Customer(String fullName) {
        this.fullName = fullName;
        this.car = null;
    }

    public String getFullName() {
        return fullName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Customer{" + "fullName='" + fullName + '\'' + ", car=" + (car != null ? car.toString() : "No car yet") + '}';
    }
}
