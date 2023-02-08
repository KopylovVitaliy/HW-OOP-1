package transport;

public abstract class Transport implements Competing{
    private final String brand;
    private final String model;
    private final double engineCapacity;

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = (brand == null || brand.isEmpty() ? "дефолт" : brand);
        this.model = (model == null || model.isEmpty() ? "дефолт" : model);
        this.engineCapacity = (engineCapacity <= 0 ? 2.0 : engineCapacity);
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
}
