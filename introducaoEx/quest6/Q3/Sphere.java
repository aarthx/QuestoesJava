package Q3;

public class Sphere extends ThreeDimensionalShape {
    private double radius;
    private final String DESCRIPTION = "Round three-dimensional object.";
    
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return ((4/3) * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
