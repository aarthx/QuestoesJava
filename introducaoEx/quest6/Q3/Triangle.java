package Q3;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;
    private final String DESCRIPTION = "Three-sided polygon with straight sides.";

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base * height)/2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}
