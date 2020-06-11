package rastishka.com;

public class Car extends Vehicle {
    private int wheels;
    private int gears;
    private int currentGear;

    public Car(int body, int size, int weight, String name, int speed, int wheels, int currentGear) {
        super(body, size, weight, name, speed);
        this.wheels = wheels;
        this.gears = 0;
        this.currentGear = 1;
    }

    public void steering(String direction){
        controlling();
        System.out.println("Steering to the " + direction);
    }

    public void changeGear(int gears){
        this.currentGear = gears;
        System.out.println("Set current gears to " + gears);
    }

    @Override
    public void move(int speed, int direction){
        System.out.println("Car.move() called");
        super.move(speed, direction);
    }

}
