public class Main {
    public static void main(String[] args) {
        FactoryAF factory = new FactoryAF();

        factory.addCar(new Car(10));
        factory.addCar(new Car(20));
        factory.addCar(new Car(15));

        factory.addCustomer(new Customer("Mary Afternoon"));
        factory.addCustomer(new Customer("John Night"));
        factory.addCustomer(new Customer("James Morning"));
        factory.addCustomer(new Customer("Jack Evening"));

        System.out.println("Before SaleCar:");
        printStatus(factory);

        factory.saleCar();

        System.out.println("After SaleCar:");
        printStatus(factory);
    }


    private static void printStatus(FactoryAF factory) {
        System.out.println("Cars in stock:");
        for (Car car : factory.getCars()) {
            System.out.println(car);
        }

        System.out.println("Customers:");
        for (Customer customer : factory.getCustomers()) {
            System.out.println(customer);
        }
    }
}
