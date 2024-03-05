package CarTest;
public class SportsCar extends car {
    // Private data member specific to SportsCar
    private int topSpeed;

    // Public member functions to set (update) the topSpeed data member
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    // Public member function to get (access) the topSpeed data member
    public int getTopSpeed() {
        return topSpeed;
    }
}