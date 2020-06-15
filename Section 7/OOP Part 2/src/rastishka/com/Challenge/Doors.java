package rastishka.com.Challenge;

public class Doors {
    private int quantity;
    private String material;
    private String color;

    public Doors(int quantity, String material, String color) {
        this.quantity = quantity;
        this.material = material;
        this.color = color;
    }

    public void openDoor(){
        System.out.println("The door opened.");
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
