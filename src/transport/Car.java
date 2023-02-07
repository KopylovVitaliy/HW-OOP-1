package transport;

import java.util.Objects;


public class Car {
    public static class Key{

        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun?"Удалённый запуск двигателя ":" без удалённого запуска ") + (withoutAccess?" бесключевой доступ ":" нет бесключевого доступа ");
        }
    }
    private Key key;
    final private String brand;
    final private String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

   final private String bodyType;
    private String registrationNumber;
   final private int numberOfSeats;
    private String transmission;
    private String wheels;



    public Car(String brand, String model, double engineVolume, String color, int year, String country, String bodyType, String registrationNumber, int numberOfSeats, String transmission, String wheels, Key key) {
        this.brand = (brand == null || brand.isEmpty() ? "дефолт" : brand);
        this.model = (model == null || model.isEmpty() ? "дефолт" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "белый" : model);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null ? "дефолт" : country);
        this.bodyType = (bodyType == null || bodyType.isEmpty() ? "седан" : bodyType);
        this.registrationNumber = (registrationNumber == null || registrationNumber.isEmpty() ? "000" : bodyType);
        this.numberOfSeats = (numberOfSeats <= 0 ? 2 : numberOfSeats);
        this.transmission = (transmission == null || transmission.isEmpty() ? "ручная" : transmission);
        this.wheels = (wheels == null || wheels.isEmpty() ? "летняя" : wheels);
        setKey(key);

    }

    public void setKey(Key key) {
        if(key == null){
            key = new Key(false, false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", transmission='" + transmission + '\'' +
                ", wheels='" + wheels + '\'' +
                '}' + " " + key;
    }

    public void replaceWheels(int month) {
        if (month < 0 || month > 12){
            this.wheels = wheels;
        } else if (month <= 2 && month > 0 || month == 12) {
            setWheels("Зимняя");
        } else if (month >= 3) {
            setWheels("Летняя");
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Key getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }
}