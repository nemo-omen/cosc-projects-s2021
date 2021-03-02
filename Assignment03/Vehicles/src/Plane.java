/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Vehicles
 * Date: February 28, 2021
********************************************/
public class Plane extends Vehicle implements wayToDrive, wayToFly {
   /**
   * number of engines the vehicle has, more engines = faster!
   */
  private int numberOfEngines;

  /**
   * name of the vehicle
   */
  private String name;

  /**
   * How many passengers the vehicle can carry
   */
  private int numberOfPassengers;

  /**
   * Where this vehicle can operate
   */
  private String whereToDrive;

  /**
   * The type of steering device this vehicle uses
   */
  private SteeringDevice yoke = new SteeringDevice(new String[]{"left", "right", "straight", "up", "down"}, "yoke");

  /**
   * The starterType
   */
  private StarterType starterType;

  
  public Plane(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive, StarterType starterType) {
    this.numberOfEngines = numberOfEngines;
    this.name = name;
    this.numberOfPassengers = numberOfPassengers;
    this.whereToDrive = whereToDrive;
    this.starterType = starterType;
  }

  public int getNumberOfEngines() {
    return numberOfEngines;
  }

  public void setNumberOfEngines(int numberOfEngines) {
    this.numberOfEngines = numberOfEngines;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }

  public void setNumberOfPassengers(int numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }

  public String getWhereToDrive() {
    return whereToDrive;
  }

  public void setWhereToDrive(String whereToDrive) {
    this.whereToDrive = whereToDrive;
  }

  public SteeringDevice getYoke() {
    return yoke;
  }

  public void setYoke(SteeringDevice yoke) {
    this.yoke = yoke;
  }

  public StarterType getStarterType() {
    return starterType;
  }

  public void setStarterType(StarterType starterType) {
    this.starterType = starterType;
  }  

  /**
   * Starts the plane
   */
  public void start() {
    starterType.start(name);
  }

  /**
   * Stops the plane
   */
  public void stop() {
    starterType.stop(name);
  }

  /**
   * Turns the plane leftward
   */
  public void turnLeft() {
    yoke.steer("left");
  }

  /**
   * Turns the plane rightward
   */
  public void turnRight() {
    yoke.steer("right");
  }

  /**
   * Turns the plane straight
   */
  public void goStraight() {
    yoke.steer("straight");
  }

  /**
   * Turns the plane upward
   */
  public void ascend() {
    yoke.steer("up");
  }

  /**
   * Turns plane downward
   */
  public void descend() {
    yoke.steer("down");
  }
}
