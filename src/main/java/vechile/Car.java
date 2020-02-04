package vechile;

public class Car extends Vehicle{

    private String helper;

    public Car(String color, int speed, String helper) {
        super(color, speed);
        this.helper = helper;
    }

    @Override
    public String toString() {
        return "Car{" +
                "helper='" + helper + '\'' +
                super.toString()+
                '}';
    }

    public String getHelper() {
        return helper;
    }

    public void setHelper(String helper) {
        this.helper = helper;
    }
}
