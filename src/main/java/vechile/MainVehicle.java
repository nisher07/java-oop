package vechile;

public class MainVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("black", 10);
        System.out.println(vehicle);

        Car car = new Car("red", 22, "abul");
        car.start();
        car.startingSound();
        System.out.println(car);

        Plane plane = new Plane("red", 22, 10);
        plane.start();
        plane.startingSound();
        System.out.println(plane);

        int[] arr = {22,1,3,6,7};

        System.out.println(Calculator.add(22,99));
        System.out.println(Calculator.add(22,99, 33));
        System.out.println(Calculator.add(arr ));


    }


}
