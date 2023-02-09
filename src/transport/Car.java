package transport;

import driver.DriverB;

import java.util.Objects;


public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineCapacity, DriverB driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Легковой автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Легковой автомобиль марки " + getBrand() + " закончил");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void bestTime() {
        double minBound = 1.2;
        double maxBound = 2.1;
        double bestTime = minBound + (maxBound - minBound)* Math.random();
        System.out.println("Максимальная скорость у грузовика = " + bestTime + " мин.");
    }

    @Override
    public void maxSpeed() {
        double minBound = 100;
        double maxBound = 200;
        double maxSpeed = minBound + (maxBound - minBound)* Math.random();
        System.out.println("Максимальная скорость у автомобиля = " + maxSpeed + " км/ч");
    }
}