package driver;

public class DriverB extends Driver {
    public DriverB(String driverName, boolean driverLicense, int driverExperience) {
        super(driverName, driverLicense, driverExperience);
    }

    @Override
    public String toString() {
        return "Водитель категории B: " + super.toString();
    }

    @Override
    public void startDrive() {
        System.out.println("Водитель легкового автомобиля " + getDriverName() + " начал движение.");
    }

    @Override
    public void stopDrive() {
        System.out.println("Водитель легкового автомобиля " + getDriverName() + " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель легкового автомобиля " + getDriverName() + " заправляет автомобиль.");
    }

}
