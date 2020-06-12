package rastishka.com;

public class Car extends Vehicle {
    private int wheels;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(int body, int size, int weight, String name, int speed, int wheels, int currentGear, boolean isManual) {
        super(body, size, weight, name, speed);
        this.wheels = wheels;
        this.gears = 0;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void steering(int direction){
        super.controlling(direction);
        System.out.println("Steering to the " + direction);
    }

    public void changeGear(int gears){
        this.currentGear = gears;
        System.out.println("Set current gear to " + gears);
    }

    @Override
    public void move(int speed, int direction){
        System.out.println("Car.move() called");
        super.move(speed, direction);
    }

}
