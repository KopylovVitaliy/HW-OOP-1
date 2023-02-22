import driver.*;
import transport.*;

import java.util.ArrayList;
import java.util.List;


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

        Mechaniс mechaniс1 = new Mechaniс("Сидоров Пётр", "ProMechanics");
        Mechaniс mechaniс2 = new Mechaniс("Венцов Сергей", "F1 mech. company");
        Mechaniс mechaniс3 = new Mechaniс("Кривко Руслан", "Bus mechanics");
        Mechaniс mechaniс4 = new Mechaniс("Петров Василий", "Truck mehPro");


        List<Mechaniс> mechaniсList = new ArrayList<>();
        mechaniсList.add(mechaniс1);
        mechaniсList.add(mechaniс2);
        mechaniсList.add(mechaniс3);
        mechaniсList.add(mechaniс4);


//        List<Mechaniс> mechaniсsList = new ArrayList<>();
//        mechaniсsList.add((Mechaniс) carMechaniсsList);
//        mechaniсsList.add((Mechaniс) busMechaniсsList);
//        mechaniсsList.add((Mechaniс) truckMechaniсsList);


        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverB1, Car.BodyType.SEDAN, mechaniсList.get(1));
        cars[1] = new Car("BMW", "Z8", 0, driverB2, Car.BodyType.HATCHBACK, mechaniсList.get(0));
        cars[2] = new Car("Kia", "Sportage 4-го поколения", 2.4, driverB3, Car.BodyType.COUPE, mechaniсList.get(1));
        cars[3] = new Car("Hyundai", "Avante", 1.6, driverB4, Car.BodyType.SEDAN, mechaniсList.get(0));

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Волжанин", "городской", 3.0, driverD1, Bus.BodyType.LARGE, mechaniсList.get(2));
        buses[1] = new Bus("BMW", "120", 4.2, driverD2, Bus.BodyType.VERY_SMALL, mechaniсList.get(2));
        buses[2] = new Bus("Mercedes", "s12", 5.0, driverD3, Bus.BodyType.SMALL, mechaniсList.get(2));
        buses[3] = new Bus("Mercedes", "s25", 5.5, driverD4, Bus.BodyType.VERY_LARGE, mechaniсList.get(2));

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Volvo", "North", 12.8, driverC1, Truck.BodyType.N2, mechaniсList.get(3));
        trucks[1] = new Truck("Mercedes", "Europe", 14.2, driverC2, Truck.BodyType.N2, mechaniсList.get(3));
        trucks[2] = new Truck("Mercedes", "S12", 15.6, driverC3, Truck.BodyType.N3, mechaniсList.get(3));
        trucks[3] = new Truck("Volvo", "Europe North", 16.1, driverC4, Truck.BodyType.N1, mechaniсList.get(3));


        List<Transport<?>> transportsList = new ArrayList<>();
        transportsList.add(cars[0]);
        transportsList.add(cars[1]);
        transportsList.add(cars[2]);
        transportsList.add(cars[3]);
        transportsList.add(buses[0]);
        transportsList.add(buses[1]);
        transportsList.add(buses[2]);
        transportsList.add(buses[3]);
        transportsList.add(trucks[0]);
        transportsList.add(trucks[1]);
        transportsList.add(trucks[2]);
        transportsList.add(trucks[3]);


        trucks[1].maxSpeed();
        buses[2].bestTime();
        printMass(cars);
        printMass(buses);
        printMass(trucks);
        trucks[3].pitStop();
        trucks[3].setBodyType(Truck.BodyType.N2);
        checkTransportDiagnostic(trucks[1]);
        checkTransportDiagnostic(cars[1]);
        checkTransportDiagnostic(buses[1]);
        checkTransportDiagnostic(buses[3]);
        checkTransportDiagnostic(cars[1]);
        checkTransportDiagnostic(trucks[3]);
        checkTransportDiagnostic(cars[2]);
        cars[2].getMechaniс().fixCar();
        treansportInfo(buses[2]);


    }

    public static void printMass(Transport<?>[] transports) {
        for (Transport<?> transport : transports) {
            System.out.println("водитель: " + transport.getDriver().getDriverName() + " "
                    + transport.getDriver().getClass() + ", управляет автомобилем: "
                    + transport.getBrand() + " " + transport.getModel() + " вид транспорта: " + transport.getType() +
                    " и будет участвовать в заезде");
        }
    }

    public static void checkTransportDiagnostic(Transport<?> transports) {

        if (transports.getType().equals(Type.BUS)) {
            try {
                transports.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println("Автобусам не нужно проходить диагностику");
            }
        } else {
            try {
                transports.passDiagnostics();
                transports.getMechaniс().performMaintenance();
            } catch (TransportTypeException e) {
                System.out.println(" ");
            }
        }
    }

    public static void treansportInfo(Transport<?> transports) {
        System.out.println(transports.getBrand() + " " + transports.getModel() + " Водитель: " +
                transports.getDriver().getDriverName() + ", Механник: " + transports.getMechaniс().getName());
    }
}