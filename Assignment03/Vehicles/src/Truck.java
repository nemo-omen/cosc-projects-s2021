public class Truck extends Vehicle implements wayToDrive {
  int numberOfEngines;
  String name;
  int numberOfPassengers;
  String whereToDrive;

  public Truck(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive) {
    this.numberOfEngines = numberOfEngines;
    this.name = name;
    this.numberOfPassengers = numberOfPassengers;
    this.whereToDrive = whereToDrive;
  }

  
  
}
