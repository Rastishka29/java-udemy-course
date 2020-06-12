package rastishka.com;

public class Main {

    public static void main(String[] args) {
        MiniCooper countryman = new MiniCooper();
        countryman.changeGear(4);
        System.out.println(countryman.hasCoolDesign());
        countryman.steering(15);
        countryman.accelerate(30);
        countryman.accelerate(20);
        countryman.accelerate(-25);
    }
}
