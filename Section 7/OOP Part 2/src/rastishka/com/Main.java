package rastishka.com;

import rastishka.com.Challenge.*;

public class Main {

    public static void main(String[] args) {

        // Lesson 91. Composition part 2.

        Dimentions dimentions = new Dimentions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimentions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v.2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // Lesson 91. Composition part 2. Challenge.

        Doors theDoors = new Doors(2,"wood", "green");
        Windows theWindows = new Windows(3,"wood", "white");
        Floor theFloor = new Floor("brown", "wood");
        Ceiling theCeiling = new Ceiling("White", "wood");
        Walls theWalls = new Walls(4,"yellow", "wood");
        Couch theCouch = new Couch("gray", 2,1, "wood","modern", true);

        Room theRoom = new Room(theWalls,theFloor,theCeiling,theWindows,theDoors,theCouch);

        theRoom.sitOnTheCouch();
        theRoom.getTheDoors().openDoor();

    }
}
