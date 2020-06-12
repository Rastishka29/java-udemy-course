package rastishka.com;

public class Main {

    public static void main(String[] args) {

        // Lesson 87 and 88 Inheritance challenge. Car examples.

//        MiniCooper countryman = new MiniCooper();
//        countryman.changeGear(4);
//        System.out.println(countryman.hasCoolDesign());
//        countryman.steering(15);
//        countryman.accelerate(30);
//        countryman.accelerate(20);
//        countryman.accelerate(-25);

        // Coding exercise 35. Cylinder.

//        Circle circle = new Circle(3.75);
//        System.out.println("Circle.radius = " + circle.getRadius());
//        System.out.println("Circle.area = " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("Cylinder.radius = " + cylinder.getRadius());
//        System.out.println("Cylinder.height = " + cylinder.getHeight());
//        System.out.println("Cylinder.area = " + cylinder.getArea());
//        System.out.println("Cylinder.volume = " + cylinder.getVolume());

        // Coding exercise 36. Pool area.

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle.width = " + rectangle.getWidth());
        System.out.println("Rectangle.length = " + rectangle.getLength());
        System.out.println("Rectangle.area = " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid.width = " + cuboid.getWidth());
        System.out.println("Cuboid.length = " + cuboid.getLength());
        System.out.println("Cuboid.area = " + cuboid.getArea());
        System.out.println("Cuboid.height = " + cuboid.getHeight());
        System.out.println("Cuboid.volume = " + cuboid.getVolume());


    }
}
