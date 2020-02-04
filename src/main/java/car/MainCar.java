package car;

public class MainCar {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(0);
//        sportsCar.start();
//        sportsCar.accelerate();
//        sportsCar.accelerate();
//        System.out.println(sportsCar);

        Truck truck = new Truck(0);
//        truck.start();
//        truck.accelerate();
//        truck.accelerate();
//        System.out.println(truck);

        startAndDrive(sportsCar);
        startAndDrive(truck);



    }

    public static void startAndDrive(Car car){
        car.start();
        car.accelerate();
        car.accelerate();
        System.out.println(car);
        car.stop();
    }



}
