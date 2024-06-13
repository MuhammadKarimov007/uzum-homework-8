import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactoryAF {
    private List<Car> cars;
    private List<Customer> customers;

    public FactoryAF() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void saleCar() {
        Iterator<Customer> customerIterator = customers.iterator();
        while (customerIterator.hasNext() && !cars.isEmpty()) {
            Customer customer = customerIterator.next();
            Car car = cars.remove(0);
            customer.setCar(car);
        }

        // Ликвидация оставшихся автомобилей
        cars.clear();
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}