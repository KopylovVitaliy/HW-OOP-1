import driver.*;
import transport.*;

public class Main {

    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Петров Василий Иванович", true, 12);
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

        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverB1);
        cars[1] = new Car("BMW", "Z8", 0, driverB2);
        cars[2] = new Car("Kia", "Sportage 4-го поколения", 2.4, driverB3);
        cars[3] = new Car("Hyundai", "Avante", 1.6, driverB4);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Волжанин", "городской", 3.0, driverD1);
        buses[1] = new Bus("BMW", "120", 4.2, driverD2);
        buses[2] = new Bus("Mercedes", "s12", 5.0, driverD3);
        buses[3] = new Bus("Mercedes", "s25", 5.5, driverD4);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Volvo", "North", 12.8, driverC1);
        trucks[1] = new Truck("Mercedes", "Europe", 14.2, driverC2);
        trucks[2] = new Truck("Mercedes", "S12", 15.6, driverC3);
        trucks[3] = new Truck("Volvo", "Europe North", 16.1, driverC4);

        trucks[1].maxSpeed();
        buses[2].bestTime();
        printMass(cars);
        printMass(buses);
        printMass(trucks);
        trucks[3].pitStop();
    }

    public static void printMass(Transport<?>[] transports) {
        for (Transport<?> transport : transports) {
            System.out.println("водитель: " + transport.getDriver().getDriverName() + " "
                    + transport.getDriver().getClass() + ", управляет автомобилем: "
                    + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
        }
    }
}