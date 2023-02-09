package transport;

import driver.DriverD;

public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineCapacity, DriverD driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestTime() {
        double minBound = 1.6;
        double maxBound = 3.40;
        double bestTime = minBound + (maxBound - minBound)* Math.random();
        System.out.println("Максимальная скорость у грузовика = " + bestTime + " мин.");
    }

    @Override
    public void maxSpeed() {
        double minBound = 60;
        double maxBound = 150;
        double maxSpeed = minBound + (maxBound - minBound)* Math.random();
        System.out.println("Максимальная скорость у автобуса = " + maxSpeed + " км/ч");
    }
}
