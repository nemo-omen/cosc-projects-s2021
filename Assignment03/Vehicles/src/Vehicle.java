/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Vehicles
 * Date: February 28, 2021
********************************************/
public abstract class Vehicle {
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
   * The type of starter the vehicle has
   */
  private StarterType starterType;

  //getters and setters
  
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfEngines() {
    return numberOfEngines;
  }

  public void setNumberOfEngines(int numberOfEngines) {
    this.numberOfEngines = numberOfEngines;
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

  public StarterType getStarterType() {
    return starterType;
  }

  public void setStarterType(StarterType starterType) {
    this.starterType = starterType;
  }

  /**
   * Method which compares two vehicle's passenger limits and returns
   * the name of the one that holds more passengers
   * @param vehicle  vehicle to compare numberOfPassengers with
   * @return String  Vehicle.name or "neither", depending on whether one vehicle
   *                  carries more passangers than the other
   */
  public String isLarger(Vehicle vehicleOne, Vehicle vehicleTwo) {
    String largerVehicleReturn;
    if(vehicleOne.getNumberOfPassengers() > vehicleTwo.getNumberOfPassengers()) {
      largerVehicleReturn = "The " + vehicleOne.getName() + " is larger than the " + vehicleTwo.getName();
    } else if (vehicleTwo.getNumberOfPassengers() > vehicleOne.getNumberOfPassengers()) {
      largerVehicleReturn = "The " + vehicleTwo.getName() + " is larger than the " + vehicleOne.getName();
    } else {
      largerVehicleReturn = "Both the " + vehicleOne.getName() + " and the " + vehicleTwo.getName() + " carry the same number of passengers";
    }
    return largerVehicleReturn;
  }

  /**
   * Method which compares two vehicle's number of engines and returns
   * the name of the one that has more engines
   * @param vehicle  vehicle to compare numberOfEngines with
   * @return String  Vehicle.name or "neither", depending on whether one vehicle
   *                  has more engines than the other
   */
  public String isFaster(Vehicle vehicleOne, Vehicle vehicleTwo) {
    String fasterVehicleReturn;
    if(vehicleOne.getNumberOfEngines() > vehicleTwo.getNumberOfEngines()) {
      fasterVehicleReturn = "The " + vehicleOne.getName() + " is faster than the " + vehicleTwo.getName();
    } else if (vehicleTwo.getNumberOfEngines() > vehicleOne.getNumberOfEngines()) {
      fasterVehicleReturn = "The " + vehicleTwo.getName() + " is faster than the " + vehicleOne.getName();
    } else {
      fasterVehicleReturn = "Both the " + vehicleOne.getName() + " and the " + vehicleTwo.getName() + " are the same speed.";
    }
    return fasterVehicleReturn;
  }

  /**
   * Abstract method all vehicle classes will need to implement which
   * describes how to start the vehicle
   * @return String  a description of the vehicle starting
   */
  public abstract void start();

  /**
   * Abstract method all vehicle classes will need to implement which
   * describes how to stop the vehicle
   * @return String  a description of the vehicle stopping
   */
  public abstract void stop();
  
}
