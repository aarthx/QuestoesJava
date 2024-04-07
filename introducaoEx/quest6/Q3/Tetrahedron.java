package Q3;

public class Tetrahedron extends ThreeDimensionalShape {
    private double edge;
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    private final String DESCRIPTION = "Four-sided solid with triangular faces.";

    public Tetrahedron(String name, double edge){
        super(name);
        this.edge = edge;
    }

    @Override
    public double getVolume() {
        return ((Math.pow(edge, 3) * Math.sqrt(2)) / 12);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) * edge * edge);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    
}
