package car;

public class Truck implements Car{
    int speed =0;

    public Truck(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public void start() {
        System.out.println("truck start");
    }

    @Override
    public void stop() {
        System.out.println("truck stop");
    }

    @Override
    public void drive() {

    }


    @Override
    public void breakCar() {

    }

    @Override
    public void accelerate() {
        speed += 2;
    }
}
