package Q4;

public class Car implements CarbonFootprint  {
    private double kmPerLiter;
    private int year;
    
    public Car(double kmPerLiter, int year) {
        this.kmPerLiter = kmPerLiter;
        this.year = year;
    }

    public double getKmPerLiter() {
        return kmPerLiter;
    }

    public void setKmPerLiter(double kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public double getCarbonFootprint() {
        //Calculated Carbon Footprint= Fuel Consumption (liter/100km = 100/kmPerLiter) × Emission Factor, the emission of a gasoline car is 2,3 kg CO2/liter 
        return ((100/kmPerLiter) * 2.3);
    }
    
}
