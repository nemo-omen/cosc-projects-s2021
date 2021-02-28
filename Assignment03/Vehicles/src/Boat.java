public class Boat extends Vehicle implements wayToDrive {
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
  private SteeringDevice rudder = new SteeringDevice(new String[]{"left", "right", "straight"}, "rudder");

  /**
   * The ignition
   */
  private Ignition ignition = new Ignition();

  
  public Boat(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive) {
    this.numberOfEngines = numberOfEngines;
    this.name = name;
    this.numberOfPassengers = numberOfPassengers;
    this.whereToDrive = whereToDrive;
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

  public SteeringDevice getRudder() {
    return rudder;
  }

  public void setRudder(SteeringDevice rudder) {
    this.rudder = rudder;
  }

  public Ignition getIgnition() {
    return ignition;
  }

  public void setIgnition(Ignition ignition) {
    this.ignition = ignition;
  }

  /**
   * Starts the boat
   */
  public void start() {
    ignition.start(name);
  }

  /**
   * Stops the boat
   */
  public void stop() {
    ignition.stop(name);
  }

  /**
   * Turns the boat leftward
   */
  public void turnLeft() {
    rudder.steer("left");
  }

  /**
   * Turns the boat rightward
   */
  public void turnRight() {
    rudder.steer("right");
  }

  /**
   * Turns the boat straight
   */
  public void goStraight() {
    rudder.steer("straight");
  }

  public int getNumberOfEngines() {
    return numberOfEngines;
  }

  public void setNumberOfEngines(int numberOfEngines) {
    this.numberOfEngines = numberOfEngines;
  }
  
}
