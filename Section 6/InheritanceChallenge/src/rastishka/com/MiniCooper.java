package rastishka.com;

public class MiniCooper extends Car {
    public MiniCooper() {
        super(1, 100, 500, "MiniCooper", 0, 4, 1, false);
    }

    @Override
    public void changeGear(int gear) {
        super.changeGear(gear);
    }

    @Override
    public void steering(int direction){
        System.out.println("MiniCooper.steering() called. Smoothly steering to " + direction + " direction.");
        super.steering(direction);
    }

    public boolean hasCoolDesign(){
        return true;
    }

    public void accelerate(int rate){
        int newSpeed = getSpeed() + rate;

        if(newSpeed == 0){
            stop();
            changeGear(1);
        }
        if(newSpeed > 0 && newSpeed <= 10){
            changeGear(1);
        }else if(newSpeed > 10 && newSpeed <= 20){
            changeGear(2);
        }else if(newSpeed > 20 && newSpeed <= 30){
            changeGear(3);
        }else {
            changeGear(4);
        }
        if(newSpeed > 0){
            move(newSpeed, getDirection());
        }
    }
}
