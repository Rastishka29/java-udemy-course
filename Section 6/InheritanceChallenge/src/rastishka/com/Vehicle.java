package rastishka.com;

public class Vehicle {
    private int body;
    private int size;
    private int weight;
    private String name;
    private int speed;
    private int direction;

    public Vehicle(int body, int size, int weight, String name, int speed){
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
        this.speed = 0;
        this.direction = 0;
    }

    public void controlling(){
        this.direction += direction;
        System.out.println("Vehicle.Controlling() called. Moving at " + direction + " degrees.");
    }

    public static void changeGear(){
        System.out.println("ChangeGear() called");
    }

    public void move(int speed, int direction){
        this.speed = speed;
        this.direction = direction;
        System.out.println("move() called. Moving at " + speed + " in direction " + direction);
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void stop(){
        this.speed = 0;
    }
}
