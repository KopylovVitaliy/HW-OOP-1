package driver;

public abstract class Driver implements Skill {
    private String DriverName;
    private boolean driverLicense;
    private int driverExperience;

    public Driver(String driverName, boolean driverLicense, int driverExperience) {
        DriverName = driverName;
        this.driverLicense = driverLicense;
        this.driverExperience = driverExperience;
    }

    public String getDriverName() {
        return DriverName;
    }


    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }

    @Override
    public String toString() {
        return DriverName + (driverLicense ? ", водительские права имеются" : ", водительских прав не имеет") +
                ", опыт вождения = " + driverExperience +
                " лет.";
    }
}
