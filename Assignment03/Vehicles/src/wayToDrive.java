public interface wayToDrive {

  /**
   * Describes left turning behavior
   * @return String  a description of the vehicle turning left
   */
  String turnLeft();

  /**
   * Describes right turning behavior
   * @return String  a description of the vehicle turning right
   */
  String turnRight();

  /**
   * Describes forward movement
   * @return String  a description of the vehicle moving forward
   */
  String goStraight();
}
