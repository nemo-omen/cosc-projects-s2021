/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Vehicles
 * Date: February 28, 2021
********************************************/

public class App {
    public static void main(String[] args){
        Truck truck = new Truck(1, "Chevy", 3, "roads", new StarterType("key"));
        truck.start();
        truck.goStraight();
        truck.turnRight();
        truck.turnLeft();
        truck.stop();
        System.out.println("");
        

        Boat boat = new Boat(2, "Yacht", 20, "sea", new StarterType("ignition system"));
        boat.start();
        boat.goStraight();
        boat.turnLeft();
        boat.turnRight();
        boat.stop();
        System.out.println("");
        

        Plane plane = new Plane(4, "Passenger Jet", 200, "sky", new StarterType("master engine switch"));
        plane.start();
        plane.goStraight();
        plane.ascend();
        plane.turnRight();
        plane.turnLeft();
        plane.descend();
        plane.stop();
        System.out.println("");

        System.out.println(boat.isFaster(plane, boat));
        System.out.println(truck.isFaster(boat, truck));
        System.out.println(plane.isFaster(plane, truck));
        System.out.println(truck.isLarger(plane, boat));
        System.out.println(boat.isLarger(plane, truck));
        System.out.println(plane.isLarger(boat, truck));
        
    }
}
