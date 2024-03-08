//Bài 3:
public class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Vehicle() {
    }

    public void start() {
        System.out.println("Khởi động xe...");
    }

    public void accelerate() {
        System.out.println("Tăng tốc...");
    }

    public void stop() {
        System.out.println("Dừng lại...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main (String[] args) {
        Car car = new Car("Toyota", "Xám", 5);
        System.out.println("Hãng xe: " + car.getBrand() + "/" + " Màu xe: " + car.getColor());
        car.start();
        car.accelerate();
        car.stop();
        System.out.println("---------------------------");

        Motorcycle motorcycle = new Motorcycle("Honda", "Đỏ", 150);
        System.out.println("Hãng xe: " + car.getBrand() + "/" + " Màu xe: " + car.getColor());
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();
        System.out.println("---------------------------");

        Truck truck = new Truck("Hyundai", "Trắng", 5000);
        System.out.println("Hãng xe: " + car.getBrand() + "/" + " Màu xe: " + car.getColor());
        truck.start();
        truck.accelerate();
        truck.stop();
        System.out.println("---------------------------");
    }
}

class Car extends Vehicle {

    private int seats;

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }
}

class Motorcycle extends Vehicle {

    private int powerMachine;

    public Motorcycle(String brand, String color, int powerMachine) {
        super(brand, color);
        this.powerMachine = powerMachine;
    }
}

class Truck extends Vehicle {

    private int maxCarry;

    public Truck(String brand, String color, int maxCarry) {
        super(brand, color);
        this.maxCarry = maxCarry;
    }
}
