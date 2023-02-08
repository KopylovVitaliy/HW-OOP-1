import transport.Bus;
import transport.Car;

public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("", null, 1.5, "желтый", 2015, "Россия", "", "", 2, "автомат", "зимние", null, 100);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия","", "1234", 2, "автомат", "зимние", new Car.Key(true, true), 200);
        Car car3 = new Car("BMW", "Z8", 0, "черный", 2021, "Германия", "", "1234", 2, "автомат", "зимние", null, 200);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея", "", "1234", 2, "автомат", "зимние", null, 200);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "", "1234", 2, "автомат", "зимние", null, 200);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car2.replaceWheels(3);
        System.out.println(car2);

        Bus bus1 = new Bus("Волжанин", "городской", 2020, "Россия", "жёлтый", 80);
        System.out.println(bus1);
        Bus bus2 = new Bus("BMW", "120", 2022, "Германия", "белый", 120);
        System.out.println(bus2);
        Bus bus3 = new Bus("Mercedes", "s12", 2018, "Германия", "чёрный", 140);
        System.out.println(bus3);
        bus1.setColor("");
        System.out.println(bus1);
    }

}