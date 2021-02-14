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

  /**
   * Starts the truck
   */
  public void howToStart() {
    ignition.start();
  }

  /**
   * Stops the truck
   */
  public void howToStop() {
    ignition.stop();
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

  /**
   * Stops the truck
   */
  public void stop() {
    System.out.println("The truck slows down and stops.");
  }
  
}
