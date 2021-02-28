public class Truck extends Vehicle implements wayToDrive {
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
  private SteeringDevice wheel = new SteeringDevice(new String[]{"left", "right", "straight"}, "steering wheel");

  /**
   * The ignition
   */
  private Ignition ignition = new Ignition();

  
  public Truck(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive) {
    this.numberOfEngines = numberOfEngines;
    this.name = name;
    this.numberOfPassengers = numberOfPassengers;
    this.whereToDrive = whereToDrive;
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

  public SteeringDevice getWheel() {
    return wheel;
  }

  public void setWheel(SteeringDevice wheel) {
    this.wheel = wheel;
  }

  public Ignition getIgnition() {
    return ignition;
  }

  public void setIgnition(Ignition ignition) {
    this.ignition = ignition;
  }

  /**
   * Starts the truck
   */
  public void start() {
    ignition.start(name);
  }

  /**
   * Stops the truck
   */
  public void stop() {
    ignition.stop(name);
  }

  /**
   * Turns the truck leftward
   */
  public void turnLeft() {
    wheel.steer("left");
  }

  /**
   * Turns the truck rightward
   */
  public void turnRight() {
    wheel.steer("right");
  }

  /**
   * Turns the truck straight
   */
  public void goStraight() {
    wheel.steer("straight");
  }
  
}
