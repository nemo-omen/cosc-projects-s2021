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
  private SteeringDevice yoke = new SteeringDevice(new String[]{"left", "right", "straight", "up", "down"}, "steering wheel");

  /**
   * The ignition
   */
  private Ignition ignition = new Ignition();

  
  public Plane(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive) {
    this.numberOfEngines = numberOfEngines;
    this.name = name;
    this.numberOfPassengers = numberOfPassengers;
    this.whereToDrive = whereToDrive;
  }

  /**
   * Starts the plane
   */
  public void start() {
    ignition.start();
  }

  /**
   * Stops the plane
   */
  public void stop() {
    ignition.stop();
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
