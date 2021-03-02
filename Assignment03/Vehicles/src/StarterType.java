/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Vehicles
 * Date: February 28, 2021
********************************************/
public class StarterType {
  /**
   * Sets name of StarterType
   */
  private String name;
  
  public StarterType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Starts the vehicle
   */
  void start(String vehicleName) {
    System.out.printf("The %s turns the %s on.%n", name, vehicleName);
  }

  /**
   * Stops the vehicle
   */
  void stop(String vehicleName) {
    System.out.printf("The %s turns the %s off.%n", name, vehicleName);
  }
}
