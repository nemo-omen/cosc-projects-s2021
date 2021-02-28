public class App {
    public static void main(String[] args){
        Truck truck = new Truck(1, "Chevy", 3, "roads");
        truck.howToStart();
        truck.goStraight();
        truck.turnRight();
        truck.turnLeft();
    }
}
