package vechile;

public class Plane extends Vehicle{
    private int totalStairs;

    public Plane(String color, int speed, int totalStairs) {
        super(color, speed);
        this.totalStairs = totalStairs;
    }

    public void startingSound(){
        System.out.println("flyyyyyyy sound");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "totalStairs=" + totalStairs +
                '}';
    }

    public int getTotalStairs() {
        return totalStairs;
    }

    public void setTotalStairs(int totalStairs) {
        this.totalStairs = totalStairs;
    }
}
