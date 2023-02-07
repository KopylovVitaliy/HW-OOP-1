package transport;

import java.util.Objects;


public class Car extends Transport{
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
            return (remoteRun?"Удалённый запуск двигателя ":" без удалённого запуска ") +
                    (withoutAccess?" бесключевой доступ ":" нет бесключевого доступа ");
        }
    }
    private Key key;
    private Transport transport;
    private double engineVolume;
   final private String bodyType;
    private String registrationNumber;
   final private int numberOfSeats;
    private String transmission;
    private String wheels;


    public Car(String brand, String model, double engineVolume, String color, int year,
               String country, String bodyType, String registrationNumber, int numberOfSeats, String transmission,
               String wheels, Key key, int maxSpeed){
        super(brand, model, year, country, color, maxSpeed);
        this.key = key;
        this.engineVolume = engineVolume;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.transmission = transmission;
        this.wheels = wheels;
    }

    public void setKey(Key key) {
        if(key == null){
            key = new Key(false, false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                " key=" + key +
                ", engineVolume=" + engineVolume +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", transmission='" + transmission + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
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


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Key getKey() {
        return key;
    }


}