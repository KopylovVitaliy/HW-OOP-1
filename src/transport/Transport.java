package transport;

import driver.Driver;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineCapacity;
    private T driver;
    private Type type;


    public Transport(String brand, String model, double engineCapacity, T driver) {
        this.brand = (brand == null || brand.isEmpty() ? "дефолт" : brand);
        this.model = (model == null || model.isEmpty() ? "дефолт" : model);
        this.engineCapacity = (engineCapacity <= 0 ? 2.0 : engineCapacity);
        setDriver(driver);
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "марка -'" + brand + '\'' +
                ", модель -'" + model + '\'' +
                ", объём двигателя - " + engineCapacity;
    }

    public abstract void startMove();

    public abstract void finishMove();
    public  Type getType(){
        return this.type;
    };
    public abstract void printType();
    public void printInfo() {
        System.out.println("водитель" + getDriver() + " управляет автомобилем" + getBrand() + " и будет участвовать в заезде");
    }
}

