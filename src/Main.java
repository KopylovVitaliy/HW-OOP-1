import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car car2 = new Car("BMW", "Z8", 0);
        Car car3 = new Car("Kia", "Sportage 4-го поколения", 2.4);
        Car car4 = new Car("Hyundai", "Avante", 1.6);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        Bus bus1 = new Bus("Волжанин", "городской", 3.0);
        Bus bus2 = new Bus("BMW", "120", 4.2);
        Bus bus3 = new Bus("Mercedes", "s12", 5.0);
        Bus bus4 = new Bus("Mercedes", "s25", 5.5);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Truck truck1 = new Truck("Volvo", "North", 12.8);
        Truck truck2 = new Truck("Mercedes", "Europe", 14.2);
        Truck truck3 = new Truck("Mercedes", "S12", 15.6);
        Truck truck4 = new Truck("Volvo", "Europe North", 16.1);

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        truck1.maxSpeed();
        truck2.bestTime();
    }

}