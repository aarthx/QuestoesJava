package Q3;

public class Cube extends ThreeDimensionalShape {
    private double side;
    private final String DESCRIPTION = "Six-sided solid with equal sides.";

    public Cube(String name, double side){
        super(name);
        this.side = side;
    }

    @Override
    public double getVolume() {
        return (Math.pow(side, 3));
    }

    @Override
    public double getArea() {
        return (6 * side * side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
    
}
