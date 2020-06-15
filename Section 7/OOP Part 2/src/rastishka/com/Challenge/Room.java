package rastishka.com.Challenge;

public class Room {
    private Walls theWalls;
    private Floor theFloor;
    private Ceiling theCeiling;
    private Windows theWindows;
    private Doors theDoors;
    private Couch theCouch;

    public Room(Walls theWalls, Floor theFloor, Ceiling theCeiling, Windows theWindows, Doors theDoors, Couch theCouch) {
        this.theWalls = theWalls;
        this.theFloor = theFloor;
        this.theCeiling = theCeiling;
        this.theWindows = theWindows;
        this.theDoors = theDoors;
        this.theCouch = theCouch;
    }

    public void enterTheRoom(Doors theDoors){
        theDoors.openDoor();
        System.out.println("You entered the room.");
    }

    public void sitOnTheCouch(){
        enterTheRoom(theDoors);
        theCouch.sitOnCouch();
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public Doors getTheDoors() {
        return theDoors;
    }
}
