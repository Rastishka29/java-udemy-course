package rastishka.com.Challenge;

public class Couch {
    private String color;
    private int width;
    private int height;
    private String material;
    private String style;
    private boolean hasLegs;

    public Couch(String color, int width, int height, String material, String style, boolean hasLegs) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.material = material;
        this.style = style;
        this.hasLegs = hasLegs;
    }

    public void sitOnCouch(){
        System.out.println("You sit on a " + color + " " + material + " couch.");
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
}
