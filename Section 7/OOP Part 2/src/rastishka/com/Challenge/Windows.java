package rastishka.com.Challenge;

public class Windows {
    private int quantity;
    private String material;
    private String color;

    public Windows(int quantity, String material, String color) {
        this.quantity = quantity;
        this.material = material;
        this.color = color;
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
