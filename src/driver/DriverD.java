package driver;

public class DriverD extends Driver{
    public DriverD(String driverName, boolean driverLicense, int driverExperience) {
        super(driverName, driverLicense, driverExperience);
    }
    @Override
    public String toString() {
        return "Водитель категории В: " + super.toString();
    }

    @Override
    public void startDrive() {
        System.out.println("Водитель автобуса "+ getDriverName()+" начал движение.");
    }

    @Override
    public void stopDrive() {
        System.out.println("Водитель автобуса "+ getDriverName()+ " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель автобуса "+ getDriverName()+ " заправляет автомобиль.");
    }
}
