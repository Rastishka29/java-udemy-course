package rastishka.com;

public class MiniCooper extends Car {
    public MiniCooper() {
        super(1, 100, 500, "MiniCooper", 0, 4, 3);
    }

    @Override
    public void changeGear(int gear) {
        super.changeGear(gear);
    }

    @Override
    public void steering(String direction){
        System.out.println("MiniCooper.steering() called. Smoothly steering to " + direction + " direction.");
        super.steering(direction);
    }

    public boolean hasCoolDesign(){
        return true;
    }

    public boolean isFast(){
        return true;
    }
}
