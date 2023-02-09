import driver.*;
import transport.*;

public class Main {

    public static void main(String[] args) {
        DriverB  driverB1 = new DriverB("Петров Василий Иванович", true, 12);
        DriverB driverB2 = new DriverB("Круглов Василий Иванович", true, 15);
        DriverB driverB3 = new DriverB("Серов Василий Иванович", true, 11);
        DriverB driverB4 = new DriverB("Котов Василий Иванович", true, 22);

        DriverC driverC1 = new DriverC("Климов Иван Иванович", true, 16);
        DriverC driverC2 = new DriverC("Сидоров Иван Иванович", true, 23);
        DriverC driverC3 = new DriverC("Иванцов Иван Иванович", true, 32);
        DriverC driverC4 = new DriverC("Кузнецов Иван Иванович", true, 21);

        DriverD driverD1 = new DriverD("Василенко Иван Иванович", true, 13);
        DriverD driverD2 = new DriverD("Игнатенок Иван Иванович", true, 11);
        DriverD driverD3 = new DriverD("Крюков Иван Иванович", true, 24);
        DriverD driverD4 = new DriverD("Сидоров Иван Иванович", true, 14);


        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverB1);
        Car car2 = new Car("BMW", "Z8", 0, driverB2);
        Car car3 = new Car("Kia", "Sportage 4-го поколения", 2.4, driverB3);
        Car car4 = new Car("Hyundai", "Avante", 1.6, driverB4);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        Bus bus1 = new Bus("Волжанин", "городской", 3.0, driverD1);
        Bus bus2 = new Bus("BMW", "120", 4.2, driverD2);
        Bus bus3 = new Bus("Mercedes", "s12", 5.0, driverD3);
        Bus bus4 = new Bus("Mercedes", "s25", 5.5, driverD4);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Truck truck1 = new Truck("Volvo", "North", 12.8, driverC1);
        Truck truck2 = new Truck("Mercedes", "Europe", 14.2, driverC2);
        Truck truck3 = new Truck("Mercedes", "S12", 15.6, driverC3);
        Truck truck4 = new Truck("Volvo", "Europe North", 16.1, driverC4);

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        truck1.maxSpeed();
        truck2.bestTime();

        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        printInfo(bus1);
        printInfo(bus2);
        printInfo(bus3);
        printInfo(bus4);
        printInfo(truck1);
        printInfo(truck2);
        printInfo(truck3);
        printInfo(truck4);
    }
    public static void printInfo(Transport<?> transport) {
        System.out.println("водитель: " + transport.getDriver().getDriverName() + " " + transport.getDriver().getClass() + ", управляет автомобилем: " + transport.getBrand()+ " " + transport.getModel() + " и будет участвовать в заезде");
    }
}