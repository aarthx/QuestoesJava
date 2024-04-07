package Q4;

public class Bicycle implements CarbonFootprint {
    private int passengers;
    private double kilometers;
    
    public Bicycle(int passengers, double kilometers) {
        this.passengers = passengers;
        this.kilometers = kilometers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getCarbonFootprint() {
        return (0.021 * (passengers * kilometers));
    }
    
}
