public class Truck extends Vehicle implements wayToDrive {
  int numberOfEngines;
  String name;
  int numberOfPassengers;
  String whereToDrive;

  public Truck(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive) {
    this.numberOfEngines = numberOfEngines;
    this.name = name;
    this.numberOfPassengers = numberOfPassengers;
    this.whereToDrive = whereToDrive;
  }

  /**
   * 
   */
  public String howToStart() {
    return "Turn the ignition key";
  }

  /**
   * 
   */
  public String turnLeft() {
    return "The truck turns to the left.";
  }

  /**
   * 
   */
  public String turnRight() {
    return "The truck turns to the right.";
  }

  /**
   * 
   */
  public String goStraight() {
    return "The truck moves forward in a more-or-less straight line.";
  }

  /**
   * Stops the truck
   * @return String  a description of the truck stopping
   */
  public String brake() {
    return "The truck slows down and stops.";
  }

  /**
   * Starts the truck
   * @return String  a description of the truck starting
   */
  public String start() {
    return "The truck's engine rumbles to life and idles smoothly.";
  }
  
}
