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

  //getters and setters
  
  public String getName() {
    return name;
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

  /**
   * Method which compares two vehicle's passenger limits and returns
   * the name of the one that holds more passengers
   * @param vehicle  vehicle to compare numberOfPassengers with
   * @return String  Vehicle.name or "neither", depending on whether one vehicle
   *                  carries more passangers than the other
   */
  public String isLarger(Vehicle vehicle) {
    String biggerVehicleName;
    if(getNumberOfPassengers() > vehicle.getNumberOfPassengers()) {
      biggerVehicleName = getName();
    } else if (vehicle.getNumberOfPassengers() > getNumberOfPassengers()) {
      biggerVehicleName = vehicle.getName();
    } else {
      biggerVehicleName = "neither";
    }
    return biggerVehicleName;
  }

  /**
   * Method which compares two vehicle's number of engines and returns
   * the name of the one that has more engines
   * @param vehicle  vehicle to compare numberOfEngines with
   * @return String  Vehicle.name or "neither", depending on whether one vehicle
   *                  has more engines than the other
   */
  public String isFaster(Vehicle vehicle) {
    String fasterVehicleName;
    if(getNumberOfEngines() > vehicle.getNumberOfEngines()) {
      fasterVehicleName = getName();
    } else if (vehicle.getNumberOfEngines() > getNumberOfEngines()) {
      fasterVehicleName = vehicle.getName();
    } else {
      fasterVehicleName = "neither";
    }
    return fasterVehicleName;
  }

  /**
   * Abstract method all vehicle classes will need to implement which
   * describes how to start the vehicle
   * @return String  a description of the vehicle starting
   */
  public abstract void howToStart();

  /**
   * Abstract method all vehicle classes will need to implement which
   * describes how to stop the vehicle
   * @return String  a description of the vehicle stopping
   */
  public abstract void howToStop();
  
}
