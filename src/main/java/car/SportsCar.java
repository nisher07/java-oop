package car;

public class SportsCar implements Car{


    int speed = 0;

    public SportsCar(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public void start() {
        System.out.println("sportscar start");
    }

    @Override
    public void stop() {
        System.out.println("sportscar stop");
    }

    @Override
    public void drive() {

    }

    @Override
    public void breakCar() {

    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}
