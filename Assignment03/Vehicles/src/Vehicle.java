public abstract class Vehicle {
  String name;
  int numberOfEngines;
  int numberOfPassengers;
  String whereToDrive;

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

  
}
