package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = (brand == null || brand.isEmpty() ? "дефолт" : brand);
        this.model = (model == null || model.isEmpty() ? "дефолт" : model);
        this.color = (color == null || color.isEmpty() ? "белый" : color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null ? "дефолт" : country);
        this.maxSpeed = (maxSpeed <= 0 ? 100 : maxSpeed);
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

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            color = "белый";
        }
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if((maxSpeed <= 0)){
            maxSpeed = 100;
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
