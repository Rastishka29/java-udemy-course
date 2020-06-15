package rastishka.com.Challenge;

public class Walls {
    private int quantity;
    private String color;
    private String material;

    public Walls(int quantity, String color, String material) {
        this.quantity = quantity;
        this.color = color;
        this.material = material;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
