package Q3;

public class Circle extends TwoDimensionalShape {
    private double radius;
    private final String DESCRIPTION = "Round shape with no straight sides.";

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
    
}
