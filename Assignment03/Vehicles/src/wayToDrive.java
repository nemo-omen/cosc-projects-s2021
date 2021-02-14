public interface wayToDrive {

  /**
   * Describes left turning behavior
   * @return String  a description of the vehicle turning left
   */
  void turnLeft();

  /**
   * Describes right turning behavior
   * @return String  a description of the vehicle turning right
   */
  void turnRight();

  /**
   * Describes forward movement
   * @return String  a description of the vehicle moving forward
   */
  void goStraight();

  /**
   * Describes stopping - because all vehicles should have a way to do this
   * @return String a description of the vehicle stopping
   */

   void stop();
}
