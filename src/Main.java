import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Elevator elevator = new Elevator(-4, 26);
        //while (true){
        //         System.out.println("Введите номер этажа: ");
        //          int floor = new Scanner(System.in).nextInt();
        //           elevator.move(floor);



        GoodsInfo goodsInfo = new GoodsInfo(new Dimensions(2, 13, 1), 23, "DD12", true, "A1", false);

        System.out.println(goodsInfo);

        GoodsInfo copy = new GoodsInfo(goodsInfo.getDimensions(), goodsInfo.getMass(), goodsInfo.getAddress(), goodsInfo.isFlip(), goodsInfo.getNumber(), goodsInfo.isFragile());

      copy = copy.setDimensions(new Dimensions(3,2,1));
      copy = copy.setMass(34);
      copy = copy.setAddress("123ABC");

        System.out.println(copy);

    }





}
