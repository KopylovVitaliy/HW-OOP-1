package transport;


public class Mechaniс {
    private String name;
    private String company;

    public Mechaniс(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void performMaintenance() {
        System.out.println("Механник " + getName() + " проводит диагностику. ");
    }

    public void fixCar() {
        System.out.println("Механник " + getName() + " ремонтирует автомобиль.");
    }

    @Override
    public String toString() {
        return "Механник: " + name  +
                ", из компании: " + company;
    }
}
