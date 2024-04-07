package Q3;

public class Square extends TwoDimensionalShape {
    private double side;
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    private final String DESCRIPTION = "Four-sided figure with equal sides.";

    public Square(String name, double side){
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
}
