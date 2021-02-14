import java.util.ArrayList;
public class SteeringDevice implements Steering{ 
  ArrayList<String> possibleDirections = new ArrayList<String>();
  String name;

  public SteeringDevice(String[] directions, String name) {
    for(String direction : directions) {
      this.possibleDirections.add(direction);
    }
    this.name = name;
  }

  public ArrayList<String> getPossibleDirections() {
    return possibleDirections;
  }

  public void setPossibleDirections(ArrayList<String> possibleDirections) {
    this.possibleDirections = possibleDirections;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void steer(String direction) {
    if(!this.possibleDirections.contains(direction)) {
      // can't turn in a direction the steering device isn't made for!
      System.out.printf("A %s can't turn %s%n", name, direction);
    } else {
      System.out.printf("The %s turns %s%n", name, direction);
    }
  }
}
