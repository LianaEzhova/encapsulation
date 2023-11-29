import static java.lang.Math.abs;

public class Elevator {
     private int currentFloor = 1;
     private int minFloor;
     private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void moveDown(){
        currentFloor = currentFloor > minFloor ? currentFloor -1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void move(int floor){
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Error occured");

        } else if (floor > currentFloor) {
            for (int i = currentFloor; i < floor; i++)
                moveUp();
            } else if(floor < currentFloor){
            for (int i = currentFloor; i > floor; i--)
                moveDown();
        }else if (floor == currentFloor) floor = currentFloor;

        }





}
