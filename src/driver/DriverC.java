package driver;

public class DriverC extends Driver {
    public DriverC(String driverName, boolean driverLicense, int driverExperience) {
        super(driverName, driverLicense, driverExperience);
    }
    @Override
    public String toString() {
        return "Водитель категории C: " + super.toString();
    }

    @Override
    public void startDrive() {
        System.out.println("Водитель грузового автомобиля "+ getDriverName()+"начал движение.");
    }

    @Override
    public void stopDrive() {
        System.out.println("Водитель грузового автомобиля "+ getDriverName()+"закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель грузового автомобиля "+ getDriverName()+" заправляет автомобиль.");
    }
}
