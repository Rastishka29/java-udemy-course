package rastishka.com;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
        // To calculate the distance between Point (x,y) and default Point (0,0)
        // Formula is Math.sqrt((this.x - 0)*(this.x - 0) + (this.y - 0)*(this.y - 0)), but we simplified it.

        return Math.sqrt(Math.pow(getX(),2) + Math.pow(getY(),2));
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow((x - getX()),2) + Math.pow((y - getY()),2));
    }

    public double distance(Point point){
        return distance(point.getX(), point.getY());
    }
}
