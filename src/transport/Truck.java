package transport;

import driver.DriverC;

public class Truck extends Transport<DriverC> {
    public Truck(String brand, String model, double engineCapacity, DriverC driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовмика");
    }

    @Override
    public void bestTime() {
        double minBound = 2;
        double maxBound = 3.40;
        double bestTime = minBound + (maxBound - minBound)* Math.random();
        System.out.println("Максимальная скорость у грузовика = " + bestTime + " мин.");
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 160;
        int maxSpeed = (int)(minBound + (maxBound - minBound)* Math.random());
        System.out.println("Максимальная скорость у грузовика = " + maxSpeed + " км/ч");
    }
}
