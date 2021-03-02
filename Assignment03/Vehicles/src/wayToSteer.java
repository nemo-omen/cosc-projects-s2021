/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Vehicles
 * Date: February 28, 2021
********************************************/
public interface wayToSteer {
  /**
   * Method for steering toward a given direction
   * @param direction  the direction to turn the control mechanism
   *                   generally one of - "up", "down", "left", "right", "straight"
   *                   but that will be left up to the mechanism class itself
   * @return String  the direction the mechanism turns if it turns successfully
   */
  public void steer(String direction);
}
